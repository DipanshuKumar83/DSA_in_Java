package Java_framework;

import java.util.LinkedList;
import java.util.Queue;

public class framework02 {
    static void main(String[] args) {
        Queue<Integer> Mark =new LinkedList<>();
        Mark.offer(85);
        Mark.offer(86);
        Mark.offer(94);
        Mark.offer(87);
        Mark.offer(61);
        IO.println(Mark);
        IO.println(Mark.peek());
        IO.println(Mark.remove(85));
        System.out.println(Mark);

 // Priority Queue
    Queue <Integer> num=new PriorityQueue<>();
        num.offer(11);
        num.offer(22);num.offer(2);
        num.offer(290);
        System.out.println(num.poll());
        System.out.println(num.poll());

    //maxHeap
        Queue <Integer> num1=new PriorityQueue<>((a,b)->b-a);
        num1.offer(11);
        num1.offer(22);
        num1.offer(2);
        num1.offer(290);
        System.out.println(num1.poll());
        System.out.println(num1.poll());
        
      // Set Interface
        Set<Integer> avg=new HashSet<>();
        avg.add(20);
        avg.add(50);
        avg.add(60);
        avg.add(10);
        avg.add(20);
        avg.add(30);
        avg.add(30);
        avg.add(40);
        avg.add(40);
        IO.println(avg);

 //RetainAll
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(4);
        set2.add(3);
        set2.add(6);
        set2.add(5);

        set1.retainAll(set2);
        IO.println(set1);


    }
}
