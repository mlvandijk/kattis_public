/*
 * https://open.kattis.com/problems/carrots
 * 
 * Created by Marit van Dijk on 17-02-2016
 */

package kattis;
import java.util.Scanner;


public class Carrots {
	public static void main(String[] args){
		//Ask the user for input
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		// Split input into two values
		String[] inputList = input.split(" ");
		int n = Integer.parseInt(inputList[0]);//contestants
		int p = Integer.parseInt(inputList[1]);//huffle-puffs (i.e. problems solved, i.e. carrots
		
		
		//process descriptions for ALL contestants
		String[] description =  new String[n];
		for(int i=0;i<n;i++){
			description[i] = scanner.nextLine();
		}

		//output second integer(carrots = problems solved)
		System.out.println(p);
	
	}
}
