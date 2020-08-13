package geometria;

public class Triangulo {
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double calcularArea() {
		double p = (ladoA + ladoB + ladoC)/2.0;
		double area = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
		
		return area;
	}
}
