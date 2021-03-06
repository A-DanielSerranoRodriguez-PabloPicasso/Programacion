package libro.Tema9.POO.ClasesEntregar;

public class Perro {
	private boolean tieneSueno, tieneHambre, esFeliz, necesitaSalir, fuera, andando, corriendo;
	private int sueno, hambre, felicidad, salir;
	private String nombre, raza, color;
	private double peso;

	// Const
	public Perro(String nombre, String raza, String color, double peso) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.peso = peso;
		this.tieneSueno = false;
		this.tieneHambre = false;
		this.esFeliz = true;
		this.necesitaSalir = false;
		this.fuera = false;
		this.andando = false;
		this.corriendo = false;
		this.sueno = 100;
		this.hambre = 100;
		this.felicidad = 100;
		this.salir = 100;
	}

	// Getters - Setters
	public boolean isTieneSueno() {
		return tieneSueno;
	}

	public boolean isTieneHambre() {
		return tieneHambre;
	}

	public boolean isEsFeliz() {
		return esFeliz;
	}

	public boolean isNecesitaSalir() {
		return necesitaSalir;
	}

	public boolean isFuera() {
		return fuera;
	}

	public boolean isAndando() {
		return andando;
	}

	public boolean isCorriendo() {
		return corriendo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getColor() {
		return color;
	}

	public double getPeso() {
		return peso;
	}

	// Methods
	public void dormir() throws Exception {
		if (!this.fuera)
			if (!this.tieneSueno)
				throw new Exception("No tiene sueño");
			else {
				this.tieneSueno = false;
				this.sueno += 50;
				this.hambre -= 30;
				this.felicidad -= 10;
				this.salir -= 20;
				this.peso -= 0.1;
				if (this.hambre < 50)
					this.tieneHambre = true;
				if (this.felicidad < 50)
					this.esFeliz = false;
				if (this.salir < 50)
					this.necesitaSalir = true;
			}
		else
			throw new Exception("Tiene que volver a casa para comer");
	}

	public void comer(int raciones) throws Exception {
		if (!this.fuera)
			if (!this.tieneHambre)
				throw new Exception("No tiene hambre");
			else {
				this.tieneHambre = false;
				this.sueno -= 20;
				this.felicidad -= 5;
				this.salir -= 30;
				this.peso += raciones * 0.2;
				if (this.sueno < 50)
					this.tieneSueno = true;
				if (this.felicidad < 50)
					this.esFeliz = false;
				if (this.salir < 50)
					this.necesitaSalir = true;
			}
		else
			throw new Exception("Tiene que volver a casa para comer");
	}

	public void jugar() throws Exception {
		if (this.tieneSueno)
			throw new Exception("No quiere jugar, esta cansado.");
		else if (this.tieneHambre)
			throw new Exception("No quiere jugar, tiene hambre.");
		else if (this.necesitaSalir)
			throw new Exception("No quiere jugar, necesita salir.");
		else {
			this.felicidad += 35;
			this.peso -= 0.05;
			this.hambre -= 20;
			this.sueno -= 20;
			this.salir -= 20;
			if (this.sueno < 50)
				this.tieneSueno = true;
			if (this.felicidad >= 50)
				this.esFeliz = true;
			if (this.salir < 50)
				this.necesitaSalir = true;
			if (this.hambre < 50)
				this.tieneHambre = true;
		}
	}

	public void pasear() throws Exception {
		if (this.fuera)
			throw new Exception("Ya estas paseando");
		else {
			this.fuera = true;
			this.andando = true;
			this.felicidad += 15;
			this.peso -= 0.05;
			this.hambre -= 10;
			this.sueno -= 20;
			if (this.sueno < 50)
				this.tieneSueno = true;
			if (this.felicidad >= 50)
				this.esFeliz = true;
			if (this.felicidad < 50)
				this.esFeliz = false;
			if (this.salir < 50)
				this.necesitaSalir = true;
			if (this.hambre < 50)
				this.tieneHambre = true;
		}
	}

	public void terminarPaseo() throws Exception {
		if (!this.fuera)
			throw new Exception("Tienes que estar paseando.");
		else {
			this.fuera = false;
			this.andando = false;
			this.corriendo = false;
		}
	}

	public void necesidades() throws Exception {
		if (!this.fuera)
			throw new Exception("Necesita salir a la calle.");
		else {
			if (!this.necesitaSalir)
				throw new Exception("No necesita hacer sus cosas.");
			else {
				this.necesitaSalir = false;
				this.salir += 50;
				this.peso -= 0.05;
			}
		}
	}

	public void andar() throws Exception {
		if (this.fuera)
			if (this.andando)
				throw new Exception("Ya esta andando.");
			else {
				this.corriendo = false;
				this.andando = true;
			}
		else
			throw new Exception("Tiene que salir a la calle.");
	}

	public void correr() throws Exception {
		if (this.fuera)
			if (this.corriendo)
				throw new Exception("Ya esta corriendo.");
			else {
				this.andando = false;
				this.corriendo = true;
			}
		else
			throw new Exception("Tiene que salir.");
	}

	public void pasarTiempo() throws Exception {
		if (this.tieneSueno)
			throw new Exception("No quiere pasar el rato, esta cansado.");
		else if (this.tieneHambre)
			throw new Exception("No quiere pasar el rato, tiene hambre.");
		else if (this.necesitaSalir)
			throw new Exception("No quiere pasar el rato, necesita salir.");
		else {
			this.felicidad += 20;
			this.hambre -= 10;
			this.sueno -= 10;
			this.salir -= 10;
			if (this.sueno < 50)
				this.tieneSueno = true;
			if (this.felicidad >= 50)
				this.esFeliz = true;
			if (this.salir < 50)
				this.necesitaSalir = true;
			if (this.hambre < 50)
				this.tieneHambre = true;
		}
	}

	// toString
	@Override
	public String toString() {
		return "Perro [tieneSueno=" + tieneSueno + ", tieneHambre=" + tieneHambre + ", esFeliz=" + esFeliz
				+ ", necesitaSalir=" + necesitaSalir + ", fuera=" + fuera + ", andando=" + andando + ", corriendo="
				+ corriendo + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", peso=" + peso + "]";
	}

}
