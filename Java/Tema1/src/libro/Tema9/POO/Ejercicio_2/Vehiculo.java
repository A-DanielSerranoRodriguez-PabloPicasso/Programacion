package libro.Tema9.POO.Ejercicio_2;

public class Vehiculo {
	private static double kilometrosTotales = 0;
	private double kilometrosRecorridos;

	public Vehiculo() {
		this.kilometrosRecorridos = 0;
	}

	// Getters

	public double getKilometrosTotales() {
		return kilometrosTotales;
	}

	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void recorre(int kil) {
		this.kilometrosRecorridos += kil;
		Vehiculo.kilometrosTotales += kil;
	}

}
