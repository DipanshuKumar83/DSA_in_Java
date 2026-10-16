package Java_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class framework01 {
    static void main(String[] args) {

        ArrayList <Integer>  list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(11);
        list.add(18);
      //  list.remove(2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("Reverse: "+ list);

       ArrayList<Integer> newlist = (ArrayList<Integer>)list.clone();
        System.out.println(newlist);

        ArrayList <Integer> list2 =new ArrayList<>();
        list2.add(101);
        list2.add(102);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list2.size());
        System.out.println(list2.contains(101));
        System.out.println(list2.contains(1002));

        // String
    ArrayList <String> Name=new ArrayList<>();
    Name.add("Dipanshu");
    Name.add("Varnaya");
    Name.add("Anshu");
        System.out.println(Name);

    //Linkedlist
        LinkedList <Integer> List4=new LinkedList<>();
        List4.add(20);
        List4.add(2);
        List4.add(32);
        List4.add(22);
        System.out.println("Linkedlist "+List4);

    //Linkedlist_String
    LinkedList<String> List5=new LinkedList<>();
    List5.add("harsh");
        List5.add("Shahsha");
        List5.add("Shivansh");
        List5.add("Nitu ");
        IO.println("Linkedlist String :"+List5);

   //JAVA Stack

    Stack<Integer> number=new Stack<>();
        number.add(12);
        number.add(19);
        number.add(14);
        number.add(13);
        System.out.println("Stack = "+ number);
        number.push(3);
        System.out.println("push " +number);
        number.pop();
        System.out.println("pop " +number);
        System.out.println(number.peek());     
    
    }
}
