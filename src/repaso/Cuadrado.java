package repaso;

public class Cuadrado extends Figura {

	private float lado;
	
	public Cuadrado(String nombre, float lado) {
		super(nombre);
		this.lado = lado;
	}

	public Cuadrado() { super(); }

	public Cuadrado(String nombre) { super(nombre); }
	
	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("l=");
		sb.append(lado);
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		if (Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado))
			return false;
		return true;
	}
	
	

}
