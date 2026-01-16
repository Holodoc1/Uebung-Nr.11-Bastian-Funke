package p1;

public class P1_Main {

	public static void main(String[] args) {
		double a = 3;
		int b = 0;
		for (b = -10; b <= 10; b++) {
			System.out.println("Rekursiv: " + potenzierenRek(a,b));
			System.out.println("Iterativ: " + potenzierenIt(a,b));
		}
	}
	
	public static double potenzierenIt(double a, int b) {
		double result = 1;
		if(b > 0) {
			for(int i = 0; i < b; i++) {
				result *= a;
			}
		}else if(b < 0) {
			result = 1 / potenzierenIt(a,-b);
		}
		return result;
	}
	
	public static double potenzierenRek(double a, int b) {
		double result = 1;
		if(b > 0) result = a * potenzierenRek(a,b - 1);
		else if(b < 0) result = 1 / potenzierenRek(a,-b);
		return result;
	}
}
