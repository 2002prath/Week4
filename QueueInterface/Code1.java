package org.example.QueueInterface;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Code1 {

    public static void main(String[] args)
    {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        //   pq.add(12);
        //   pq.add(21);
        //   pq.add(76);
        //   pq.add(54);
        //   pq.add(34);
        //   pq.add(23);

        pq.add(9);
        pq.add(19);
        pq.add(91);
        pq.add(92);
        pq.add(29);
        pq.add(32);

        System.out.println("Elements of  a priority Queue :");
        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println("Queue after removing element : "+pq );
        while(!pq.isEmpty())
        {
            System.out.print(pq.poll()+" ");
        }
    }
}
