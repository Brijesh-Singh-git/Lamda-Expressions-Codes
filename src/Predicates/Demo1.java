package Predicates;

import java.util.function.Predicate;

// Predicate ---> Always take one parameter and returns Boolean
// USe only if you have conditional checks in your program
public class Demo1 {
	
	public static void main(String[] args) {
		
		
		//Example 1 
		Predicate<Integer> p=i->(i>10);  //Lamda Expression using Predicate Interface
		
		System.out.println(p.test(15));  //true
		System.out.println(p.test(4));  //false
		
		
		
		//Example 2: Check the length of the given string is greater than 4 or not 
		
		Predicate<String> pr=s->(s.length()>4);
		
		System.out.println(pr.test("Welcome")); //true 
		System.out.println(pr.test("Hi"));     //false 
		
		
		
		//Example 3: Print Array elements whose size is greater than 4 from the array
		String names[] = {"David","Scott","John","Mary","Alex","Danny"};
		
		for(String name: names){
			
			if(pr.test(name)) {         //Lamda expression 
				System.out.println(name);
			}
			
			/*if(name.length()>4) {         //Traditional Approach
				System.out.println(name);
			}*/
		}
	}
}
