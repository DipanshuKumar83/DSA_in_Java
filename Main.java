package Polymorphism;

public class Main {
    static void main(String[] args) {
        Calculator c=new Calculator();

        System.out.println(c.add(12,13));
        System.out.println(c.add(12,13,4));
        System.out.println(c.add(12,13,12,22));

        //@override
        Shape s=new Shape();
        s.Draw();

        Circle c=new Circle();
        c.Area();

    }
}
