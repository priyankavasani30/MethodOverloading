package mainmethod;

public class OverloadDemo {

	public static void main(String[] args)
	{
		
		//main(100);
		main("Hello");
	}
	
	// Overloaded main method with a single int parameter
    public static void main(int arg) 
    
    {
        System.out.println("Overloaded main method with int argument: " + arg);
    }

    // Overloaded main method with a single String parameter
    public static void main(String arg) {
        System.out.println("Overloaded main method with String argument: " + arg);
    }
}
