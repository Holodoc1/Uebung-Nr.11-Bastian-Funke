package p2;

public class P2_Main {

	public static void main(String[] args) {
		double zweierpotenz = 2048;
		for(int i = 1; i <= zweierpotenz; i *= 2) {
			System.out.println("Rekursiv: " + log2Rek(i));
			System.out.println("Iterativ: " + log2It(i));
		}
		System.out.println();
		for(int i = 1; i <= zweierpotenz; i *= 2) {
			System.out.println("Rekursiv: " + log2Rek(1.0 / i));
			System.out.println("Iterativ: " + log2It(1.0 / i));
		}
	}
	
	public static int log2It(double zweierpotenz) {
		int result = 0;
		if(zweierpotenz > 1) {
			for(int i = 1; i < zweierpotenz; i *= 2) {
				result++;
			}
		}else if(zweierpotenz > 0 && zweierpotenz < 1) {
			for(double i = zweierpotenz; i < 1; i *= 2) {
				result--;
			}
		}
		return result;
	}
	
	public static int log2Rek(double zweierpotenz) {
		int result = 0;
		if(zweierpotenz > 1) result = log2Rek(zweierpotenz / 2) + 1;
		else if(zweierpotenz > 0 && zweierpotenz < 1) result = log2Rek(zweierpotenz * 2) - 1;
		return result;
	}
}
