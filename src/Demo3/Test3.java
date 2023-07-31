package Demo3;


interface cab
{
	public String bookCab(String source, String destination);  //abstract Method
}

//class ola implements cab 
//{ 
//	public String bookCab(String source, String destination) {
//		
//		System.out.println("Ola cab is booked from " + source + " to " + destination); 
//		
//		return ("Price: 5400 Rs");
//	}
//}




public class Test3 {
	
	public static void main(String[] args) {
		
		cab Cab = (source, destination)-> { System.out.println("Ola cab is booked from " + source + " to " + destination); 
											return ("Price: 5400 Rs"); }; //Lamda Expression
		
		System.out.println(Cab.bookCab("Agra", "Mathura")); 
		
	}
}
