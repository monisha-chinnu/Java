import java.util.Scanner;

public class Function {
	public static void main(String arg[]) {
		
		System.out.println("Enter 2 values");
		
		Scanner s = new Scanner(System.in);
		int no1 = s.nextInt();
		int no2 = s.nextInt();
		
		int result = sum(no1,no2);
		System.out.println("Result : " + result);
		
		
	}
	static int sum(int a,int b){
		int s = a + b;
		return s;
	}
	


}
