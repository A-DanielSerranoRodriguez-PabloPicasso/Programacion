package libro.Tema9.POO.Ejercicio_2;

public class Bicicleta extends Vehiculo {
	private int pinones;

	public Bicicleta(int pinon) {
		super();
		this.pinones = pinon;
	}

	public void hacerCaballito() {
		System.out.println("Hago caballito");
	}
}
