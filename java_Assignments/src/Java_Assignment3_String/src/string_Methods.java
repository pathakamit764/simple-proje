
public class string_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java String pool refers to collectons of Strings which are stored in heap memory";
		 
		
		// String in lower case
		
		System.out.println(s.toLowerCase());
		
		System.out.println("------------------------------------------------------------");
		
		// String in upper case
		
		System.out.println(s.toUpperCase());
		
		System.out.println("------------------------------------------------------------");
		// Replace all 'a' character with $ sign
		
		System.out.println(s.replace('a', '$'));
		
		System.out.println("------------------------------------------------------------");
		
		//match old String with new
	
	//	String newString ="java string pool refers to collectons of strings which are stored in heap memory";
		
		System.out.println(s.matches("java string pool refers to collectons of strings which are stored in heap memory"));
		System.out.println(s.equals("java string pool refers to collectons of strings which are stored in heap memory"));
		

	}

}
