class Parent {
    int x= 5;
    public void info(){
        System.out.println("Ini Class Parent");
    }
}

class Child extends Parent{
    int x= 10;
    public void info(){
        System.out.println("Ini Class Child");
    }
}
public class Tes{
    public static void main(String[] args) {
        Parent tes = new Child();
        System.out.println("nilai x: "+tes.x);
        tes.info();
    }
}