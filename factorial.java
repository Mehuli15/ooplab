import java.util.Scanner;
public class factorial{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=scanner.nextInt();
		long fact=1;
		for (int i=1; i<=num; i++){
			fact *=i;
		}
		

		System.out.println("The factorial is  : "+ fact);
		scanner.close();
	}
}