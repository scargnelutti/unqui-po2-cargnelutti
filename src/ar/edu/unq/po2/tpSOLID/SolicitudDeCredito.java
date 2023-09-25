package ar.edu.unq.po2.tpSOLID;

public abstract class SolicitudDeCredito {

	protected Cliente solicitante;
	protected double montoSolicitado;
	protected int plazoEnMeses;
	
	public abstract void evaluarEn(Banco banco);

}
