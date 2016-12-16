package kattis;
// https://open.kattis.com/problems/rollcall

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RollCall {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Person> students = new ArrayList<>();
		Map<String, Integer> firstNames = new HashMap<>();

		// Read names 
		String line = br.readLine();
		while (line.length() > 0) {
			String[] tokens = line.split(" ");
			if (tokens [0] != null) {
			Person p = new Person (tokens[0], tokens[1]);
			students.add(p);
			}
			// Count first names to determine ambiguity
			if (firstNames.containsKey(tokens[0])) {
		        // Map already contains the first name; increment it's count by 1
		    	int nr = firstNames.get(tokens[0]);
		    	firstNames.put(tokens[0], nr + 1);
		    } else {
		        // Map does not contain first name; add first name with count = 1
		    	firstNames.put(tokens[0], 1);
			// Read next line
		    }	
			line = br.readLine();
			if (line == null) {
				break;
			}
 		}
		// Sort
		Collections.sort(students);
		
		/* Print the list of names, one per line. 
		 * Where the first name is unambiguous, just list the first name. 
		 * If two people have the same first name, also list their last names to resolve the ambiguity.
		 * */
		for (Person s: students) {
			if (firstNames.get(s.firstName) > 1) {
				System.out.println(s);
			} else {
				System.out.println(s.firstName);
			}
		}
		
		br.close();
	}	
}

class Person implements Comparable<Person> {
	String firstName;
	String lastName;
	
	public Person (String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	/* Sort:
	 * sorted by last name. 
	 * If two or more people have the same last name, order these people by first name. 
	 */
	public int compareTo(Person p){
		// Sort by last name
		if (!this.getLastName().equals(p.getLastName())) {
			return this.getLastName().compareTo(p.getLastName());		
		} else { // or by first name if they have the same last name
			return this.getFirstName().compareTo(p.getFirstName());	
		}
	}
	
	public String toString(){		
		return firstName + " " + lastName;
	}
	
}

