package ar.edu.unq.po2.tpSOLID;

import java.util.ArrayList;

public class ClienteEMail {
	
	 ServidorPop servidor; // El tipo podría ser IServidor, para soportar otros servidores, como SMTP
	 String nombreUsuario;
	 String passUsuario;
	 ArrayList<Correo> inbox; // El tipo podría ser List<>, para no estar acoplado a la implementación de ArrayList<>
	private ArrayList<Correo> borrados; // Idem
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){ // El primer argumento debe ser de tipo List<>
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passUsuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrados(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
