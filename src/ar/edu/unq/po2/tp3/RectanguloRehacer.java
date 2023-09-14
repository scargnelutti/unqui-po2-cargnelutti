package ar.edu.unq.po2.tp3;

public class RectanguloRehacer {
	// Rehacer con la implementación del TP 1
	private Point esquinaSuperiorIzquierda;
	private Point esquinaInferiorDerecha;
	
	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	public void setEsquinaInferiorDerecha(Point esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	public RectanguloRehacer(Point esquinaSuperiorIzquierda, Point esquinaInferiorDerecha) {
		super();
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}
	
	public int getArea() {
		return this.getAncho() * this.getAlto();
	}

	public int getAlto() {
		return Math.abs(Math.abs(this.esquinaInferiorDerecha.getY()) - Math.abs(this.esquinaSuperiorIzquierda.getY()));
	}

	public int getAncho() {
		return Math.abs(Math.abs(this.esquinaInferiorDerecha.getX()) - Math.abs(this.esquinaSuperiorIzquierda.getX()));
	}
	
	public int getPerimetro() {
		return (this.getAncho() + this.getAlto()) * 2;
	}
}
