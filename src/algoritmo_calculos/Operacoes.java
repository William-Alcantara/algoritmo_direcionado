package algoritmo_calculos;

public class Operacoes {	
	
	public double a;
	public double b;
	
	public double areaQuadrado(){
		return  a * b;//calcula a area do quadrado		
	}
	public double areaTriangulo() {
		return (a*b)/2;//calcula a area do triangulo 
	}
	public double areaRetangulo() {
		return a * b;//calcula a area do retangulo  
	}
	public double areaLosagulo() {
		return (a*b)/2;//no losango é usado D1 e D2 de diagonal maior, a formula é mesma do triangulo 
	}
	public double tempFahrenheit(){
		return a *1.8 + 32;	// converte de Celsius para Fahrenheit  para ao contrario divide por 32	
	}
	
	
}
