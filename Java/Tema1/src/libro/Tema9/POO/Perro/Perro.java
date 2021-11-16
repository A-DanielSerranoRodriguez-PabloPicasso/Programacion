package libro.Tema9.POO.Perro;

public class Perro {
	private boolean dormido, sueno, hambriento, feliz, necesitaSalir, moviendose, corriendo, andando;
	private int edadAnos, edadMeses, velocidad, racion, hambre = 0, kmDia, necesidades = 0, aguante = 10;
	private double peso, altura, anchura, ingesta, perdido;
	private char sexo;
	private String juguete, raza, nombre, color, manchas, colorManchas, colorOjos, tamanoCola;

	// Geters
	public boolean isDormido() {
		return dormido;
	}

	public boolean isSueno() {
		return sueno;
	}

	public boolean isHambriento() {
		return hambriento;
	}

	public boolean isFeliz() {
		return feliz;
	}

	public boolean isNecesitaSalir() {
		return necesitaSalir;
	}

	public boolean isMoviendose() {
		return moviendose;
	}

	public boolean isCorriendo() {
		return corriendo;
	}

	public boolean isAndando() {
		return andando;
	}

	public int getEdadAnos() {
		return edadAnos;
	}

	public int getEdadMeses() {
		return edadMeses;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getRacion() {
		return racion;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double getAnchura() {
		return anchura;
	}

	public double getIngesta() {
		return ingesta;
	}

	public double getPerdido() {
		return perdido;
	}

	public char getSexo() {
		return sexo;
	}

	public String getJuguete() {
		return juguete;
	}

	public String getRaza() {
		return raza;
	}

	public String getNombre() {
		return nombre;
	}

	public String getColor() {
		return color;
	}

	public String getManchas() {
		return manchas;
	}

	public String getColorManchas() {
		return colorManchas;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public String getTamanoCola() {
		return tamanoCola;
	}

	// Constructor
	public Perro(int edadAnos, int edadMeses, double peso, double altura, double anchura, char sexo, String raza,
			String nombre, String color, String manchas, String colorManchas, String colorOjos, String tamanoCola) {
		super();
		this.edadAnos = edadAnos;
		this.edadMeses = edadMeses;
		this.peso = peso;
		this.altura = altura;
		this.anchura = anchura;
		this.sexo = sexo;
		this.raza = raza;
		this.nombre = nombre;
		this.color = color;
		this.manchas = manchas;
		this.colorManchas = colorManchas;
		this.colorOjos = colorOjos;
		this.tamanoCola = tamanoCola;
		this.dormido = false;
		this.sueno = false;
		this.feliz = true;
		this.hambriento = false;
		this.necesitaSalir = false;
	}

	// Metodos

	public void comer() {
		if (this.hambre > 0) {
			if (this.hambriento && this.hambre < 5) {
				if (this.hambre <= 2) {
					this.hambre = 0;
					this.necesidades += 1;
				} else {
					this.hambre -= 2;
					this.necesidades += 2;
				}
			} else if (this.hambriento && this.hambre < 8) {
				this.hambre -= 3;
				this.necesidades += 3;
			} else if (this.hambriento && this.hambre >= 8 && this.hambre <= 10) {
				this.hambre -= 4;
				this.necesidades += 4;
			}
			if (this.sueno && !this.feliz) {
				this.aguante -= 2;
			} else if (this.sueno) {
				this.aguante -= 1;
			}
		}
	}

	public void salir(int tiempo) {
		if (this.necesidades != 0 && tiempo >= 1) {
			this.necesidades = 0;
			this.aguante -= (int) 2 / tiempo;
		}
	}

}