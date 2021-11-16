package libro.Tema9.POO.Perro;

public class Motocicleta {
	boolean arrancada, luzCorta, luzLarga, luzEmergencia, intermitenteDerecho, intermitenteIzquierdo;
	String color, marca, matricula, modelo, tipoGasolina;
	int caballosPotencia;
	double deposito, cantidadGasolina, velocidad, aguanteRueda1, aguanteRueda2, kilometros;

	// Getters

	public Motocicleta(String color, String marca, String matricula, String modelo, String tipoGasolina,
			int caballosPotencia, double deposito) {
		super();
		this.color = color;
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.tipoGasolina = tipoGasolina;
		this.caballosPotencia = caballosPotencia;
		this.deposito = deposito;
		this.arrancada = false;
		this.cantidadGasolina = deposito / 2;
		this.velocidad = 0;
		this.aguanteRueda1 = 100;
		this.aguanteRueda2 = 100;
		this.luzCorta = false;
		this.luzLarga = false;
		this.luzEmergencia = false;
		this.intermitenteDerecho = false;
		this.intermitenteIzquierdo = false;
		this.kilometros = 0;
	}

	public boolean isArrancada() {
		return arrancada;
	}

	public boolean isLuzCorta() {
		return luzCorta;
	}

	public boolean isLuzLarga() {
		return luzLarga;
	}

	public boolean isLuzEmergencia() {
		return luzEmergencia;
	}

	public boolean isIntermitenteDerecho() {
		return intermitenteDerecho;
	}

	public boolean isIntermitenteIzquierdo() {
		return intermitenteIzquierdo;
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipoGasolina() {
		return tipoGasolina;
	}

	public int getCaballosPotencia() {
		return caballosPotencia;
	}

	public double getDeposito() {
		return deposito;
	}

	public double getCantidadGasolina() {
		return cantidadGasolina;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public double getAguanteRueda1() {
		return aguanteRueda1;
	}

	public double getAguanteRueda2() {
		return aguanteRueda2;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void arrancar() throws Exception {
		if (this.arrancada)
			throw new Exception("Motocicleta ya arrancada");
		else {
			this.arrancada = true;
			this.cantidadGasolina = cantidadGasolina * 0.95;
		}
	}

	public void apagar() throws Exception {
		if (this.arrancada) {
			if (this.velocidad != 0) {
				throw new Exception("Parate burro");
			} else
				this.arrancada = false;
		} else
			throw new Exception("Motocicleta ya apagada");
	}

	public double repostar(double gasolina) throws Exception {
		double coste = 0;

		if (this.arrancada)
			this.arrancada = false;
		if (this.luzCorta)
			this.luzCorta = false;
		if (this.luzLarga)
			this.luzLarga = false;
		if (this.luzEmergencia)
			this.luzEmergencia = false;
		if (this.intermitenteDerecho)
			this.intermitenteDerecho = false;
		if (this.intermitenteIzquierdo)
			this.intermitenteIzquierdo = false;

		this.velocidad = 0;

		if (gasolina > this.deposito - this.cantidadGasolina) {
			this.cantidadGasolina = this.deposito;
			coste = this.deposito * 1.15;
		} else if (gasolina < this.deposito - this.cantidadGasolina && gasolina > 0) {
			this.cantidadGasolina += gasolina;
			coste = gasolina * 1.15;
		} else if (gasolina == 0) {
			coste = 0;
		} else {
			throw new Exception("Introduce una cantidad de gasolina positiva");
		}

		return coste;
	}

	public void recorrer(double km/* , int velocidad */) throws Exception {
		if (this.arrancada = false)
			throw new Exception("Tienes que arrancar la moto");
		else {
			this.aguanteRueda1 -= 5 * 0.1;
			this.aguanteRueda2 -= 5 * 0.1;
			this.cantidadGasolina -= ((/* velocidad */this.velocidad * 0.01) * km) * 0.05;
		}
	}

	public void acelerar(int velocidad) throws Exception {
		if (this.arrancada = false) {
			throw new Exception("Tienes que arrancar la moto");
		} else {
			this.velocidad += velocidad;
			this.kilometros += this.velocidad * 0.8;
			recorrer(this.velocidad * 0.8);
		}

	}

	public void frenar(int velocidad) throws Exception {
		if (this.velocidad > 0) {
			if (velocidad == this.velocidad || velocidad >= this.velocidad) {
				this.velocidad = 0;
			} else
				this.velocidad -= velocidad;
			recorrer(this.velocidad*0.2);
		} else if (this.velocidad == 0) {
			throw new Exception("Ya estás quieto");
		}
	}
	
	public void marchaAtras(int velocidad) throws Exception{
		
	}

	public void reparar() throws Exception {

		if (this.arrancada != true) {
			this.luzCorta = false;
			this.luzLarga = false;
			this.luzEmergencia = false;
			this.intermitenteDerecho = false;
			this.intermitenteIzquierdo = false;

			if ((this.aguanteRueda1 >= 0 && this.aguanteRueda1 <= 60)
					|| (this.aguanteRueda2 >= 0 && this.aguanteRueda2 <= 60)) {
				this.aguanteRueda1 = 100;
				this.aguanteRueda2 = 100;
				if (this.cantidadGasolina == 0) {
					repostar(this.deposito);
				}
			} else {
				throw new Exception("La moto no necesita arreglos todavia.");
			}
		} else {
			throw new Exception("Apaga la moto");
		}
	}

	@Override
	public String toString() {
		return "Motocicleta [arrancada=" + arrancada + ", luzCorta=" + luzCorta + ", luzLarga=" + luzLarga
				+ ", luzEmergencia=" + luzEmergencia + ", intermitenteDerecho=" + intermitenteDerecho
				+ ", intermitenteIzquierdo=" + intermitenteIzquierdo + ", color=" + color + ", marca=" + marca
				+ ", matricula=" + matricula + ", modelo=" + modelo + ", tipoGasolina=" + tipoGasolina
				+ ", caballosPotencia=" + caballosPotencia + ", deposito=" + deposito + ", cantidadGasolina="
				+ cantidadGasolina + ", velocidad=" + velocidad + ", aguanteRueda1=" + aguanteRueda1
				+ ", aguanteRueda2=" + aguanteRueda2 + ", kilometros=" + kilometros + "]";
	}

}