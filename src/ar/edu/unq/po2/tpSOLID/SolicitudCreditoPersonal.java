package ar.edu.unq.po2.tpSOLID;

public class SolicitudCreditoPersonal extends SolicitudDeCredito {

	@Override
	public void evaluarEn(Banco banco) {
		/*boolean ingresosAnualesMayoresA15000 = solicitante.getSueldoNetoAnual() >= 15000;
		boolean montoDeCuotaMenorAl70PorCiento = (solicitante.getSueldoNetoMensual() * 0.7) > 2;*/
		banco.evaluarSolicitud(this);
	}
}
