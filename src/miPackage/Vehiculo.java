package miPackage;

public abstract class Vehiculo {

	protected Persona chofer;
	protected double kmRecorridos;
	
	public Vehiculo(Persona chofer, double kmRecorridos) {
		this.chofer = chofer;
		this.kmRecorridos = kmRecorridos;
	}
	
	public abstract boolean cambiarChofer(Persona chofer);

	@Override
	public String toString() {
		return "Vehiculo [chofer=" + chofer + ", kmRecorridos=" + kmRecorridos + "]";
	}
}
