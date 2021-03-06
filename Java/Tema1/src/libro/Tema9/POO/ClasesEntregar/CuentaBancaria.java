package libro.Tema9.POO.ClasesEntregar;

public class CuentaBancaria {
	private String dni, iban;
	private double saldo;
	private int pin, contador;
	private boolean bloqueada, conectada;

	// Const
	public CuentaBancaria(String dni, int pin) {
		super();
		this.dni = dni;
		this.pin = pin;
		this.iban = Integer.toString((int) (Math.random() * 601));
		this.saldo = 0;
		this.bloqueada = false;
		this.conectada = false;
		this.contador = 0;
	}

	// Getters - Setters
	public String getDni() {
		return dni;
	}

	public String getIban() {
		return iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isBloqueada() {
		return bloqueada;
	}

	public boolean isConectada() {
		return conectada;
	}

	// Methods
	public void comprobarPin(int pin) {
		if (this.pin == pin) {
			this.bloqueada = false;
			this.conectada = true;
		} else {
			this.contador += 1;
			if (this.contador == 3) {
				this.bloqueada = true;
				this.conectada = false;
			}
		}
	}

	public void desbloquear(int pin) {
		if (this.pin == pin) {
			this.bloqueada = false;
		}
	}

	public void salir() {
		if (this.conectada) {
			this.conectada = false;
		} else
			System.out.println("No estas conectado");
	}

	public void ingreso(double cantidad) throws Exception {
		if (!this.bloqueada && this.conectada)
			if (cantidad > 0)
				this.saldo += cantidad;
			else {
				if (cantidad == 0) {
					System.out.println("Introduce algo de dinero");
				} else
					throw new Exception("Introduce una cantidad de dinero positiva");
			}
		else
			System.out.println("Cuenta bloqueada");

	}

	public void retirada(double cantidad) throws Exception {
		if (!this.bloqueada && this.conectada)
			if (cantidad > 0)
				if (cantidad <= this.saldo)
					this.saldo -= cantidad;
				else
					System.out.println("No tienes tanto dinero");
			else {
				if (cantidad == 0) {
					System.out.println("Introduce algo de dinero");
				} else
					throw new Exception("Introduce una cantidad de dinero positiva");
			}
		else
			System.out.println("Cuenta bloqueada");
	}

	public void transferencia(CuentaBancaria destino, double cantidad) {
		if (!this.bloqueada && this.conectada)
			if (!destino.bloqueada) {
				try {
					this.retirada(cantidad);
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					destino.conectada = true;
					destino.ingreso(cantidad);
					destino.conectada = false;
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else
				System.out.println("Cuenta destinataria bloqueada");
		else
			System.out.println("Cuenta bloqueada");

	}

	// toString
	@Override
	public String toString() {
		return "CuentaBancaria [dni=" + dni + ", iban=" + iban + ", saldo=" + saldo + ", conectada=" + conectada
				+ ", bloqueada=" + bloqueada + "]";
	}

}
