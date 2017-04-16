package miPackage;

public class Motocicleta extends Vehiculo {

	private Persona acompaņante;
	
	public Motocicleta(Persona chofer, double kmRecorridos) {
		super(chofer,kmRecorridos);
	}
	
	public Motocicleta(Persona chofer, double kmRecorridos, Persona acompaņante) {
		super(chofer,kmRecorridos);
		this.acompaņante = acompaņante;
	}

	@Override
	public boolean cambiarChofer(Persona chofer) {
		if (acompaņante == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
	
	public boolean agregarAcompaņante(Persona acompaņante) {
		if (this.acompaņante == null) {
			this.acompaņante = acompaņante;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " Motocicleta [acompaņante=" + acompaņante + "]";
	}
	
}
