public class password{
    public static void main(String[] args) {
        String firstName="Subhash";
        String middleName="Chandra";
        String lastName="Bose";
        int age=55;
        String first= firstName.substring(0,1)+middleName.substring(0,1)+lastName.substring(0,1);
        String Password=first.toLowerCase()+age;
        System.err.println("Name : Mehuli Sarkar\nClass : CSE-B\nRoll no : AV.SC.U4CSE24150");
        System.out.println("Password : "+Password);
    }
}