import java.util.Scanner;
public class simpleInterest{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the principal : ");
		double principal=scanner.nextDouble();
		System.out.print("Enter the interest : ");
		double interest=scanner.nextDouble();
		System.out.print("Enter the time : ");
		double time=scanner.nextDouble();
		double simpleInterest=(principal*interest*time)/100;

		System.out.println("The simple interest  is  : "+simpleInterest);
		scanner.close();
	}
}