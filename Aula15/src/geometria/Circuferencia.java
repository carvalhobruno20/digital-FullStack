package geometria;

public class Circuferencia {
	
	public static final double PI = 3.1415;
	
	public static double circuferencia(double raio) {
		return 2.0 * PI * raio; 
	}
	
	public static double volume(double raio) {
		return 4 * PI * Math.pow(raio, 3.0) / 3;
	}

}
