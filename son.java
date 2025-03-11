class grandfather{
    public double height;
    public string language;
    void spirituality(){
        System.out.println("Spirituality");
    }
    void knowledge(){
        System.out.println("Knowledge");
    }
}
class father extends grandfather {
    public int age;
    public string surname;
    void wisdom(){
        System.out.println("Wisdom");
    }
    void experience(){
        System.out.println("Expirence");
    }
}
class son extends father {
    public int age;
    public string name;
    void study(){
        System.out.println("Studying");
    }
    void excercise(){
        System.out.println("excercise");
    }
    public static void main( string args[]){
        grandfather language="Bengali";
        son name="Joy";
        father surname="Dutta";
        son age=15;
        son child=new son;
        child.knowledge();
        child.wisdom();
        child.study();
        System.out.println("language : "+language+" Name : "+name+" Surname : "+surname+" Age : "+age+);
    }
}
