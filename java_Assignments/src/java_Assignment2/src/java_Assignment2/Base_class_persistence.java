package java_Assignment2;

abstract class persistence{
	abstract void persist();
}
class filepersistence extends persistence{

	@Override
	void persist() {
		// TODO Auto-generated method stub
		
	}
}
	class databasepersistence extends persistence{

		@Override
		void persist() {
			// TODO Auto-generated method stub
			
		}
	
}


public class Base_class_persistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persistence p = new  databasepersistence();

	}

}
