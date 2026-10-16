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
    }
}
