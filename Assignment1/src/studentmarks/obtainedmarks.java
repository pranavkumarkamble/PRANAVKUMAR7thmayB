package studentmarks;

public class obtainedmarks {
	
	int maths ;
	int physics;
	int chemistry;
	
	public void student() {
		System.out.println("Maths = " +maths);
		System.out.println("physics = "+physics);
		System.out.println("chemistry = "+chemistry);
	}
	
	public static void main (String []args)
	{
		obtainedmarks Raju = new obtainedmarks();
		System.out.println("marks of Raju");
		Raju.maths=70;
		Raju.physics=75;
		Raju.chemistry=80;
		Raju.student();
		
		
		obtainedmarks Suraj = new obtainedmarks();
		System.out.println("marks of Suraj");
		Suraj.maths=65;
		Suraj.physics=70;
		Suraj.chemistry=55;
		Suraj.student();
		
		
	}
	

}
