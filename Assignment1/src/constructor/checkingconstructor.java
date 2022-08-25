package constructor;

public class checkingconstructor {
	
	public checkingconstructor(int a) {
		System.out.println("Constructor 1 is running");
	}
	
	public checkingconstructor() {
		this(24);
		System.out.println("constructor 2 is Running");
	
	}
	
	public checkingconstructor(int a,boolean b) {
		this();
		System.out.println("constructor 3 is Running");
		
	}
	
public static void main(String [] args) {
	new checkingconstructor(24, true);
}
} 
