package empleados;
class Sphere {
	
	private double diametro;
	
	public Sphere(double d) {
	
		diametro=d;
	}
	
	public double radio() {
		return diametro/2;
	}

	public void setDiametro(double diametro) {
		
		this.diametro=diametro;
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public double getArea() {
		return 4.0*Math.PI*Math.pow(this.radio(),2);
		
	}
	
	public double getVolumen() {
		return (4.0/3.0)*Math.PI*(Math.pow(this.radio(),3));
	}
	
	public String toString() {
		return "La esfera 1 tiene un diametro de " + this.diametro + " Y un area de " + this.getArea()+
				"Y por ultimo tiene u volumen de : " + this.getVolumen();
	}
	
	
	
	
}
