/**
 * Solution for WERTYU: https://open.kattis.com/problems/wertyu
 * Created by Marit van Dijk on 04-03-2016
 */

import java.util.Scanner;

public class WERTYU {
	public static void main(String[] args){
		// Use scanner to process input
		Scanner scanner = new Scanner(System.in);
		
		do {
			String encoded = scanner.nextLine();		
			String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		
			for (int i = 0; i < encoded.length(); i++){
				if(encoded.charAt(i)==' ') {
					System.out.print(" ");
				} else {
					System.out.print(keyboard.charAt(keyboard.indexOf(encoded.charAt(i))-1));
				}
			}
			System.out.print("\n");
		} while (scanner.hasNextLine())	;
	}
}
