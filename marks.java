import java.util.Scanner;

class marks{
    public static void main(String []args){

        //take input from user

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks : ");
        double marks=input.nextDouble();

        //use ternary operator

        String result=(marks>=40)?"Passed":"Failed";

        //output

        System.out.println("You have "+result+" the exam");
    }
}