import java.util.Scanner;
public class temp{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the temperature in Fahernheit : ");
		double fahernheit=scanner.nextDouble();
		double celsius=(fahernheit-32)*5/9;
		

		System.out.println("The temerature in celcius is  : "+ celsius);
		scanner.close();
	}
}