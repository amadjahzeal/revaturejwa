
public class DemoLoop {

	public static void main(String[] args) {
		System.out.println("Printing by for loop : ");
		//for loop
		int counter=1;
		for(counter=1;counter<=10;counter=counter+2) {
			System.out.println(counter);
		}

		System.out.println("Printing by while loop : ");
		//while loop
		int number=1;
		
		while(number<=5) {
			System.out.println(number);
			number++;
		}
		
		System.out.println("Printing by do while loop : ");
		
		int noOfAttempts=10;
		
		do
		{
			System.out.println("You have attempts remaining :"+noOfAttempts);
			noOfAttempts++;
		}while(noOfAttempts>20);
		
	}

}
