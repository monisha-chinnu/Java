import java.util.Scanner;

public class If {
	public static void main(String arg[]) {
		
		System.out.println("Enter the no");
		
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		
		if(no < 0) {
			System.out.println("No is negative");
		}
		else {
			System.out.println("No is positive");
		}
	}

}
