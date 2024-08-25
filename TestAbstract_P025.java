package Assignment;
abstract class Parent {
    abstract void message();
}

class Subclass1 extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class Subclass2 extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}


public class TestAbstract_P025 {
    public static void main(String[] args) {
    Parent obj1 = new Subclass1();
    obj1.message();

    Parent obj2 = new Subclass2();
    obj2.message();
}


}
