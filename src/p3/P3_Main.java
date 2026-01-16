package p3;

public class P3_Main {

	public static void main(String[] args) {
		int kapital = 1004;
		int jahre = 20;
		for(int i = 0; i <= jahre; i++) {
			System.out.println(zinsen(kapital,i));
		}
	}
	
	public static int zinsen(int kapital, int n) {
		int result = kapital;
		if(n > 0) result = (int)(1.05 * zinsen(kapital, n - 1));
		return result;
	}
}
