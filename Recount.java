package kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//TLE 9/9
public class Recount {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String result = "Runoff!";
		Map<String, Integer> votes = new HashMap<>();
		int max = 0;
		
		while (true) {
			String name = br.readLine();
			if (name.equals("***")){
				break;
			} else {
			    if (votes.containsKey(name)) {
			        // Map already contains the name key; increment it's count by 1
			    	int nr = votes.get(name);
			    	votes.put(name, nr + 1);
			    	// Check if this contestant has highest number of votes
					if (nr > max) {
						max = nr;
						result = name;
					} else if (nr == max){
						result = "Runoff!";
					}
			    } else {
			        // Map doesn't have mapping for name; add one with count = 1
			    	votes.put(name, 1);
			    }
			}
		}
		System.out.println(result);
	}
}	

