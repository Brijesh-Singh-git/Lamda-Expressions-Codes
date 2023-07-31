package Demo;

@FunctionalInterface
interface Cab 
{
	public void bookCab();
	
}


// This whole thing we can write using Lamda Expression 

//class Ola implements Cab { 
//	
//	public void bookCab() {
//		
//		System.out.println("Ola cab is Booked....."); 
//	}
//}





public class Test1 {

	public static void main(String[] args) {
		
		Cab cab =()->System.out.println("Ola cab is Booked.....");  //Lamda Expressions
		cab.bookCab();

	}

}
