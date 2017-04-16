package miPackage;

public class Motocicleta extends Vehiculo {

	private Persona acompa�ante;
	
	public Motocicleta(Persona chofer, double kmRecorridos) {
		super(chofer,kmRecorridos);
	}
	
	public Motocicleta(Persona chofer, double kmRecorridos, Persona acompa�ante) {
		super(chofer,kmRecorridos);
		this.acompa�ante = acompa�ante;
	}

	@Override
	public boolean cambiarChofer(Persona chofer) {
		if (acompa�ante == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
	
	public boolean agregarAcompa�ante(Persona acompa�ante) {
		if (this.acompa�ante == null) {
			this.acompa�ante = acompa�ante;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " Motocicleta [acompa�ante=" + acompa�ante + "]";
	}
	
}
