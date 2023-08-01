package Predicates;

import java.util.function.Predicate;

//Joining predicates - and , or, negate
//p1  -> checks number is even
//p2  -> checks greater than 50 


public class Demo3 {

	public static void main(String[] args) {
		
		int a[]= {5,15,2,45,78,67,90,32,43,78,55,65,89,104,22,92,13};
		
		Predicate<Integer> p1 =i->i%2==0;
		Predicate<Integer> p2 =i->i>50;
		
		//and
		System.out.println("Following are numbers EVEN & Greater than 50 .....");
		
		for(int n:a) {
			
			if(p1.and(p2).test(n)) { //if(p1.test(n) && p2.test(n))
				
				System.out.println(n);
			}
		} 
		
		System.out.println();
		System.out.println("Following are numbers EVEN OR Greater than 50 .....");
		//or
		for(int n:a) {
			
			if(p1.or(p2).test(n)) { //if(p1.test(n) || p2.test(n))
				
				System.out.println(n);
			}
		} 
		
		System.out.println();
		System.out.println("Following are numbers EVEN *Negate* Greater than 50 .....");
		//negate
		for(int n:a) {
			
			if(p1.negate().test(n)) { 
				
				System.out.println(n);
			}
		} 
	}

}
