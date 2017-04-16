package miPackage;

import java.util.LinkedList;
import java.util.List;

public class Autobus extends Vehiculo {

	private List<Persona> pasajeros;
	
	public Autobus(Persona chofer, double kmRecorridos) {
		super(chofer,kmRecorridos);
		pasajeros = new LinkedList<Persona>();
	}

	@Override
	public boolean cambiarChofer(Persona chofer) {
		if (pasajeros.isEmpty()) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
	
	public void agregarPasajero(Persona pasajero) {
		pasajeros.add(pasajero);
	}

	@Override
	public String toString() {
		return super.toString() + " Autobus [pasajeros=" + pasajeros + "]";
	}

}
