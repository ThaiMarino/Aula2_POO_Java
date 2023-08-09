package exemploAula01;

class Quadrado {
	double lado;
	
	public Quadrado() {
		this.lado=0;
 	}
	//temos dois construtores diferentes aqui
	//isso pode ser chamado de sobrecarga de coletor ou polimorfismo
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado(){
		return this.lado;
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	
	public double calculaArea(){
		return lado*lado;
	}
	
	public double calculaPerimetro() {
		return this.lado*4;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + "]";
	}
	
	
}
