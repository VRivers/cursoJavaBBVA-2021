package repaso;

public class Triangulo extends Figura {
	
	private float altura;
	private float base;
	
	
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
	

	@Override
	public float calcularPerimetro() {
		int hipotenusa = (int) Math.sqrt((base*base)+(altura*altura));
		return base+altura+hipotenusa;
	}

	@Override
	public float calcularSuperficie() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

	@Override
	public String getValores() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
