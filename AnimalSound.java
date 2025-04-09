abstract class Animal{
    abstract void sound();
}
class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger growls");
    }
}
class Lion extends Animal{
    @Override
    public void sound(){
        System.out.println("Lion growls");
    }
}
public class AnimalSound{
    public static void main(String[] args) {
        System.out.println(" Name : Mehuli Sarkar\n Brunch : CSE(B)\n Roll No : AV.SC.U4CSE24150");
        Tiger t=new Tiger();
        t.sound();
        Lion lion=new Lion();
        lion.sound();
    }
}