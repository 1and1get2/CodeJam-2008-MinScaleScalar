package sort;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class MinScaleScalar {
	static boolean DEBUG = false;
//	static boolean DEBUG = true;
	
	static int cases, counter = 0;
//	static Scanner scanner = new Scanner(System.in);
	static Scanner scanner;
	static File inputFile, outputFile;
	static BufferedWriter bw;
	
	
	public static void main(String[] args) throws IOException{
//		String fileName = "A-large-practice";
		String fileName = "A-small-practice";
		String outPutString;
		inputFile = new File(fileName + ".in");
		outputFile = new File(fileName + ".out");
		scanner = new Scanner(new FileReader(inputFile));
		bw = new BufferedWriter(new FileWriter(outputFile));
		cases = scanner.nextInt();
		while(++counter <= cases){
			int paras = scanner.nextInt();
			int[] firstParas = new int[paras];
			int[] secondParas = new int[paras];
			for (int i = 0; i < paras; i++)
				firstParas[i] = scanner.nextInt();
			for (int i = 0; i < paras; i++)
				secondParas[i] = scanner.nextInt();
			Arrays.sort(firstParas);
			Arrays.sort(secondParas);
			long maxSum = 0, minSum = 0;
			for (int i = 0; i< paras; i++){
				maxSum += firstParas[i] * secondParas[i];
				minSum += firstParas[i] * secondParas[paras - 1 - i];
			}
			outPutString = ("Case #" + counter + ": " + (DEBUG ? "min: " + minSum + " max: " + maxSum : minSum));
			bw.write(outPutString);
			bw.newLine();
			System.out.println(outPutString);
		}
		bw.flush();
		bw.close();
		scanner.close();
	}
}