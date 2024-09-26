import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        // stack 후입 선출 LIFO FiLO
        // queue 선입 선출 FIFO
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3); // in
        int p = stack.pop(); //out
        System.out.println(p);
        System.out.println(stack.size());

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30); //in
        System.out.println(queue.size());
        int q1 = queue.poll(); // out
        System.out.println(q1 + " " + queue.size());
        int q2 = queue.peek(); // 다음으로 빠져나올 값 보기
        System.out.println(q2 + " " + queue.size());
    }
}
