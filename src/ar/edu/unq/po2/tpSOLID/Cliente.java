package ar.edu.unq.po2.tpSOLID;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double sueldoNetoAnual;
	
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.sueldoNetoAnual = sueldoNetoMensual * 12;
	}

	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}

	public boolean esAptoParaUnCreditoPersonal() {
		return (this.sueldoNetoAnual >= 15000) && ((this.sueldoNetoMensual * 0.7) > 2);
	}

	public double getSueldoNetoMensual() {
		return (this.sueldoNetoMensual);
	}
}
