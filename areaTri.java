import java.util.Scanner;
public class areaTri{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the length of first side  : ");
		double a=scanner.nextDouble();
		System.out.print("Enter the length of second side  : ");
		double b=scanner.nextDouble();
		System.out.print("Enter the length of third side  : ");
		double c=scanner.nextDouble();
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("The area is  : "+ area);
		scanner.close();
	}
}