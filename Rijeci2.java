/**
 * Solution for Rijeci: https://open.kattis.com/problems/rijeci
 * Note: Fixed for "Time limit exceeded"
 * 
 * Created on 14-07-2016
 * @author Marit van Dijk
 */

package kattis;
import java.util.Scanner;


public class Rijeci2 {
	public static void main(String[] args){
		//use scanner to process input
		Scanner scanner = new Scanner(System.in);
		
		//read number of times the button is pressed
		int n = scanner.nextInt();
		
		int countA = 1;
		int countB = 0;
		
		for(int i=0; i<n; i++){
			int swap = countB;
			countB = countA + countB;
			countA = swap;
		}
		
		//output nr of A and B in final string
		System.out.println(countA + " " + countB);
	}
}
