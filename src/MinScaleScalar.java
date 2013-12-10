import java.util.Scanner;


public class MinScaleScalar {
	static int cases;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		
		cases = scanner.nextInt();
		for (int i = 0; i < cases; i++){
			int[] firstParas = new int[i];
			int[] secondParas = new int[i];
			for (int j = 0; j < i; j++){
				firstParas[j] = scanner.nextInt();
			}
			for (int j = 0; j < i; j++){
				secondParas[j] = scanner.nextInt();
			}
			System.out.println("Case #" + (i+1) + ": " + min(crossMuti(i, firstParas, secondParas)));
		}
	}
	private static int[] crossMuti(int f, int[] firstParas, int[] secondParas){
		int[] results = new int[getFactorial(f)];
		return null;
	}
	public static int min(int[] args){
		int min = args[0];
		for (int i : args){
			if (min > i) min = i;
		}
		return min;
	}
	private static int getFactorial(int f){
		return ( f <= 1 ? 1 : f * getFactorial(--f));
	}
}
