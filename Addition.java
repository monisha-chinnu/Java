import java.util.Scanner;

public class Addition {
	public static void main(String arg[]) {
		
		System.out.println("Enter 2 no");		
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int c = a + b ;
		
		System.out.println("The entered no is : " + a + " " + b);
		System.out.println("Result is : " + "," + c);
	}

}
