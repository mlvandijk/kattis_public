/**
 * Solution for Rijeci: https://open.kattis.com/problems/rijeci
 * Note: This solution gets "Time limit exceeded"
 * 
 * Created on 14-07-2016
 * @author Marit van Dijk
 */


import java.util.Scanner;



public class Rijeci {
	public static void main(String[] args){
		//use scanner to process input
		Scanner scanner = new Scanner(System.in);
		
		String string = "A";

		//read number of times the button is pressed
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++){
			string = string.replace('A', '0');
			string = string.replace("B", "BA");
			string= string.replace('0', 'B');
		}
		System.out.println(string);
		
	}
}
