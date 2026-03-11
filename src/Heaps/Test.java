package Heaps;

public class Test {
    public static void main(String[] args) {
        int arr [] = {10,45,76,91,202,1,0,90,86};
        int k = 3;
        KthSmallest_Largest kth = new KthSmallest_Largest();
        kth.KthLargest(arr,k);
        kth.KthSmallest(arr,k);
    }
}
