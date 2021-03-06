package libro.Tema9.POO.ClasesEntregar;

public class Motocicleta {
	private boolean arrancada, adelante, atras;
	private double cantidadGasolina, deposito, kilometrosTotales;
	private String marca, modelo, color, matricula;
	private int velocidad, caballos;

	// Const
	public Motocicleta(String marca, String modelo, String color, String matricula, double deposito, int caballos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.deposito = deposito;
		this.cantidadGasolina = deposito * 0.70;
		this.caballos = caballos;
		this.arrancada = false;
		this.adelante = false;
		this.atras = false;
		this.velocidad = 0;
		this.kilometrosTotales = 0;
	}

	// Getters - Setters
	public boolean isArrancada() {
		return arrancada;
	}

	public boolean isAdelante() {
		return adelante;
	}

	public boolean isAtras() {
		return atras;
	}

	public double getCantidadGasolina() {
		return cantidadGasolina;
	}

	public double getDeposito() {
		return deposito;
	}

	public double getKilometrosTotales() {
		return kilometrosTotales;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getCaballos() {
		return caballos;
	}

	// Methods
	public void arrancar() throws Exception {
		if (!this.arrancada)
			this.arrancada = true;
		else
			throw new Exception("Ya esta arrancada");
	}

	public void apagar() throws Exception {
		if (this.velocidad != 0)
			throw new Exception("Necesitas estar quieto para apagar la moto.");
		else {
			if (this.arrancada)
				this.arrancada = false;
			else
				throw new Exception("Ya esta apagada");
		}
	}

	public void acelerar(int velocidad) throws Exception {
		if (!this.arrancada)
			throw new Exception("Necesitas arrancar la moto.");
		else {
			if (this.atras)
				throw new Exception("Tienes que pararte para poder acelerar");
			else {
				this.adelante = true;
				this.atras = false;
				this.velocidad += velocidad;
			}
		}

	}

	public void marchaAtras(int velocidad) throws Exception {
		if (!this.arrancada)
			throw new Exception("Necesitas arrancar la moto.");
		else {
			if (this.adelante)
				throw new Exception("Tienes que pararte para poder dar marcha atras");
			else {
				this.atras = true;
				this.velocidad = velocidad;
			}
		}
	}

	public void frenar(int velocidad) throws Exception {
		if (!this.arrancada)
			throw new Exception("Necesitas arrancar la moto.");
		else {
			if (this.adelante || this.atras)
				if (velocidad >= this.velocidad) {
					this.velocidad = 0;
					this.adelante = false;
					this.atras = false;
				} else
					this.velocidad -= velocidad;
			else
				throw new Exception("Ya estas quieto");
		}
	}

	public void recorrer(double km) throws Exception {
		if (!this.arrancada)
			throw new Exception("Necesitas arrancar la moto.");
		else {
			if (this.velocidad == 0)
				throw new Exception("Tienes que tener velocidad para moverte");
			else {
				if (this.atras) {
					this.kilometrosTotales += km * 0.002;
					this.cantidadGasolina -= this.velocidad*0.1;
				}
				else {
					this.kilometrosTotales += km;
					this.cantidadGasolina -= this.velocidad*0.1;
				}
			}
		}
	}

	public double repostar(double cantidad) throws Exception {
		double coste;
		if (this.arrancada) {
			throw new Exception("Apaga la moto burro");
		} else {
			if (cantidad + this.cantidadGasolina >= this.deposito) {
				coste = this.cantidadGasolina;
				this.cantidadGasolina = this.deposito;
				return coste = (this.deposito - coste) * 1.2;
			} else if (cantidad <= 0) {
				System.out.println("No repostas nada");
				return coste = 0;
			} else {
				this.cantidadGasolina += cantidad;
				return coste = cantidad * 1.2;
			}
		}
	}

	// toString
	@Override
	public String toString() {
		return "Motocicleta [arrancada=" + arrancada + ", adelante=" + adelante + ", atras=" + atras
				+ ", cantidadGasolina=" + cantidadGasolina + ", deposito=" + deposito + ", kilometrosTotales="
				+ kilometrosTotales + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula="
				+ matricula + ", velocidad=" + velocidad + ", caballos=" + caballos + "]";
	}

}
