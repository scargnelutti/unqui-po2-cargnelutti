package ar.edu.unq.po2.tpSOLID;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudesDeCredito;
	
	public Banco() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
	}
	
	public void evaluarSolicitudes() {
		for (SolicitudDeCredito solicitud: solicitudesDeCredito) {
			solicitud.evaluarEn(this);
			
		}
	}
	
	public void evaluarSolicitud(SolicitudDeCredito solicitud) {
		// si no cumple las condiciones
			// eliminarDeSolicitudes
		// sino agregar 
		
	}
	
	public void evaluarSolicitud(SolicitudCreditoPersonal solicitud) {
		
	}
	
}
