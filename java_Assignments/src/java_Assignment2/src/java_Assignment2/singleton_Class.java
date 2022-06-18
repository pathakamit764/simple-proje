package java_Assignment2;

public class singleton_Class {
	  private static String name;
	  private singleton_Class(){

	      }
	      public static void getFullName(String firstName,String lastName ){
	          name=firstName+" " +lastName;
	          System.out.println(name);
	      }
	      public static void main(String[] args) {
	    	  singleton_Class sc=new singleton_Class();
	          sc.getFullName("jhon","walker");
	      }
	  }
	  //class A extends SingletonClass{
	  //
	  //}
	  //To achieve inheritance in singleton class constructor needs to be in public/protected