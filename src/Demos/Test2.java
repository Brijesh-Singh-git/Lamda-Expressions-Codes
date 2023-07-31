package Demos;


interface cab
{
	public void bookCab(String source, String destination);  //abstract Method
}

//class ola implements cab 
//{ 
//	public void bookCab(String source, String destination) {
//		
//		System.out.println("Ola cab is booked from " + source + " to " + destination);
//	}
//}


public class Test2 {
	
	public static void main(String[] args) {
		
		cab Cab =(source, destination)->System.out.println
				("Ola cab is booked from " + source + " to " + destination);   //Lamda Expression

		Cab.bookCab("Delhi", "Agra");
		
	}
}
