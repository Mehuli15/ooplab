import java.util.Scanner;

class positive{
    public static void main(String []args){
        //take input from user
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        double number=input.nextDouble();
        //use ternary operator
        String result=(number>=00)?"Positive":"Negative";
        //output
        System.out.println("You have entered a "+result+" number");
    }
}