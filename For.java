import java.util.Scanner;

public class For {
	public static void main(String arg[]) {
		
		System.out.println("Enter the limit : ");
		
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		
		System.out.println("Limit is : " + limit);
		
		System.out.println("\nThe sum of limit nos are : ");
		
		int sum = 0;
		
		for(int i=1;i<=limit;i++)
		{
			sum = sum + i;	
		}
		System.out.println(sum);
		
	}

}
