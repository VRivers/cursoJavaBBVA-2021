package repaso;

public class Circulo extends Figura {
	
	
	private float radio;
	
	public Circulo() {super();	}
	
	public Circulo(String nombre, float radio) {super(nombre);
		this.radio = radio;
	}

	
	public float calcularPerimetro() {
		return 2 * (float)Math.PI * this.radio;
	}
	
	public float calcularSuperficie() {
		return (float)(Math.PI * Math.pow(this.radio,2));
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(radio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public String getValores() {
		// TODO Auto-generated method stub
		return "Circulo [radio=" + this.radio + "]";
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
