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
	} // Creo que cumple con el SRP. Un cliente email debe estar conectado a un servidor para ser un cliente email
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo); // this.borrados.add(correo);
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

	
	// OCP: Se viola este metodo al tipar con clases concretas las colecciones y especialmente
	// el servidor, porque así se depende de la implementación a la que pertenece el tipo. Esto hace obligatorio 
	// modificar el programa para poder extenderlo.
	// La alternativa es usar las interfaces List<> y IServidor.
	// A su vez se viola el DIP, por las mismas razones.
	
	// ¿Podría tipar a ClienteEMail con una interfaz?
}
