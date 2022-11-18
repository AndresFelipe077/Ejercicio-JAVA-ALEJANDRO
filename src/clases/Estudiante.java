package clases;

public class Estudiante {
	
	protected String nombre; 
	protected int edad;
	protected double peso;
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public void mostrar()
	{
		System.out.println(this.nombre);
		System.out.println(this.edad);
		System.out.println(this.peso);
	}
	
	public void mostrar(Estudiante estudiante)
	{
		estudiante.mostrar();
	}
	
	
}
