import java.util.ArrayList;
public class arrayList1{
    public static void main(String[] args){
       ArrayList<String> cars=new ArrayList<>(); 
       cars.add("Volvo");
       cars.add("Ford");
       System.out.println("Cars name :"+ cars);
       cars.add(0,"Audi");
       System.out.println("Updated Cars name :"+ cars);
       cars.set(0,"Mazda");
       System.out.println("Modified Cars name :"+ cars);
       cars.remove(0);
       System.out.println("Re-modified Cars name :"+ cars);
       cars.clear();
       System.out.println(cars);
    }
}