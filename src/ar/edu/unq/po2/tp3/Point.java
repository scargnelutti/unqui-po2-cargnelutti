package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public void moverPuntoA(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point sumarConPunto(Point punto) {
		/*
		this.setX(this.getX() + punto.getX());
		this.setY(this.getY() + punto.getY());*/
		int x = this.getX() + punto.getX();
		int y = this.getY() + punto.getY();
		return new Point(x, y);
	}
}
