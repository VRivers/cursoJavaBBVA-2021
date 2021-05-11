package repaso;

public class Triangulo extends Figura {
	
	private float altura;
	private float base;
	private float hipotenusa;
	

	public Triangulo() { super(); }

	public Triangulo(String nombre) { super(nombre); }
	
	public Triangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}
	
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}
	
	public float getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(float hipotenusa) {
		this.hipotenusa = (int) Math.sqrt((base*base)+(altura*altura));;
	}
	

	@Override
	public float calcularPerimetro() {
		return base+altura+hipotenusa;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

	@Override
	public String getValores() {
		StringBuilder sb = new StringBuilder("b=");
		sb.append(base);
		sb.append("h=");
		sb.append(hipotenusa);
		return sb.toString();
	}
	
	

}
