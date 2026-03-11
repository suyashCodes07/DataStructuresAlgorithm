package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest_Largest {

    public void KthLargest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {

            pq.offer(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Kth Largest: " + pq.peek());
    }

    public void KthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {

            pq.offer(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Kth Smallest: " + pq.peek());
    }
}