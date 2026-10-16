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
       

    }
}
