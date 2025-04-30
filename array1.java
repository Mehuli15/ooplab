
import java.util.Arrays;

public class array1{
    public static void main(String[] args) {
        String[] element={"red","Delhi","East","Gulab jamun"};
        System.out.println("Name : Mehuli Sarkar\nClass : CSE-B\nRoll no : AV.SC.U4CSE24150");
        Arrays.sort(element);
        for (String elements : element){
            System.out.println(elements+" ");
        }

        int[] array={1,2,3,4};
        System.out.println(Arrays.toString(array));

        int [] array2=new int[5];
        Arrays.fill(array2,4);
        for( int i : array2){
            System.out.println(i+" ");
        }

        System.out.println(Arrays.toString(array));

    }
}