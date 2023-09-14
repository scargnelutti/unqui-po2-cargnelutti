package ar.edu.unq.po2.tp3;

// import java.time.LocalDate;
// import java.time.Period;

public class Persona {
	
	/* Ejercicio 10
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		super();
		// LocalDate.of(aaaa, mm, dd);
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int calcularEdad() {
		return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
	}

	public boolean menorQue(Persona persona) {
		return this.calcularEdad() < persona.calcularEdad();
	}
	
	
	1. Responder: Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u
	obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto?
	No lo conoce porque esa información está disponible solo para el objeto Persona. El mecanismo se 
	llama encapsulamiento.
	
	2. Agregue a la clase Persona definida anteriormente el método
	menorQue(Persona persona)
	que recibe como parámetro a otra persona y retorna true en caso de que el receptor sea menor en
	edad que el parámetro, o false en caso contrario.
	3. Agregue a la clase Persona un método (de clase) de creación, respetando la siguiente firma:
	Persona(String nombre, Date fechaNacimiento)
	que recibe como parámetros el nombre y la fecha de nacimiento de la persona a crear, crea una
	nueva instancia de Persona y la retorna inicializada con los valores recibidos como parámetro.
	*/
	
	// Ejercicio 11
	private String nombre;
	private String apellido;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}
}
