class MyClass {
    static int count;
    static double pi;

    public int getCount() {
        return count;
    }

    public static double getPi() { 
        return pi;
    }

    public MyClass(int count, double pi) {
        MyClass.count = count; 
        MyClass.pi = pi;
    }
}

class Value {
    public static void main(String[] args) {
        MyClass c = new MyClass(4, 3.14);
        System.out.println(c.getCount());
        System.out.println(MyClass.getPi());
    }
}

