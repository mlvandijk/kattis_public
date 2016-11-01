/**
 * Solution for Volim: https://open.kattis.com/users/maritvandijk/submissions/volim
 * Created by Marit van Dijk on 06-03-2016
 * 
 */

package kattis;
import java.util.Scanner;


public class Volim {
	public static void main(String[] args){
		//use scanner to process input
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();//player that starts
		int n = scanner.nextInt();//number of questions asked
			
//		//read lines containing time elapsed and answer
//		//T = true, N = false, P = skipped. 
		int[] times = new int[n];
		String[] answers = new String[n];
		for(int i = 0; i<n; i++){
			times[i] = scanner.nextInt();
			answers[i] = scanner.next();
		}
	
		//determine which player is holding the box at the end of the game (at 3 min 30 sec, or 210 sec)
		int end = 210;
		int totalTime = 0;
		int player = k;
		for(int i = 0; i<n; i++){
			totalTime = totalTime + times[i];
			if(totalTime>=end){
				break;	
			}else if(answers[i].equals("T")){
				player++;
			}
			if (player > 8){
				player = player-8;
			}
		}
		
		System.out.println(player);

	}
}
