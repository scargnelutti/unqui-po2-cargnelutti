package ar.edu.unq.po2.tpSOLID;

import java.util.List;

public interface IServidor {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passUsuario);

	public void enviar(Correo correo);
	/*
	public float tasaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();
	*/
	
	// SRP: Se viola este principio en el último método de la clase, ya que le agrega 
	// al servidor la responsabilidad de realizar copias de sí mismo	

		
	// 
}
