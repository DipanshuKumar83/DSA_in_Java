package Abstraction;

interface bird {
     void fly();

     void eat();
}
class sparrow implements bird {
    public void fly() {
        IO.println("Sparrow is flying");
    }

    public void eat() {
        IO.println("Sparrow is eating...");
    }
}

 class Main{

    public static void main(String[] args) {
        bird b=new sparrow();
        b.eat();
        b.fly();

     }
 }
