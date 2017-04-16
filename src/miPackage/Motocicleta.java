package miPackage;

public class Motocicleta extends Vehiculo {

	private Persona acompañante;
	
	public Motocicleta(Persona chofer, double kmRecorridos) {
		super(chofer,kmRecorridos);
	}
	
	public Motocicleta(Persona chofer, double kmRecorridos, Persona acompañante) {
		super(chofer,kmRecorridos);
		this.acompañante = acompañante;
	}

	@Override
	public boolean cambiarChofer(Persona chofer) {
		if (acompañante == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
	
	public boolean agregarAcompañante(Persona acompañante) {
		if (this.acompañante == null) {
			this.acompañante = acompañante;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " Motocicleta [acompañante=" + acompañante + "]";
	}
	
}
