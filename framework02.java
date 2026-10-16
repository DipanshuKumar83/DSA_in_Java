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

    }
}
