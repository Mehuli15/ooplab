import java.util.Scanner;
public class fibonacciSeries{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=scanner.nextInt();
		int num1=0, num2=1;
		System.out.println("Fibonacci series upto "+ num+" term");
		for (int i=1; i<=num; i++){
			System.out.print(num1+" ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}		
		scanner.close();
	}
}