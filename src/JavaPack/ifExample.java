package JavaPack;

public class ifExample {

	public static void main(String[] args) {
		int marks=-50;
		if((marks>0) && (marks<40))
		{
			System.out.println("Participant failed due to low score of " + marks);
		}
		else
		if((marks>=40) && (marks >100))
		{
			System.out.println("Participant passed due to pass score of " + marks);
		}
		
		else
			System.out.println("Invalid Score");

	}

}
