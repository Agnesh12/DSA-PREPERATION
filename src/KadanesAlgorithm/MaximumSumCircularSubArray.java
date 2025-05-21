package KadanesAlgorithm;

public class MaximumSumCircularSubArray {
    public static int SubArray(int[] arr) {
        int MaxSum = arr[0];
        int MinSum = arr[0];
        int CirMax = 0;
        int CirMin = 0;
        int Total = 0;
        for(int num : arr) {
            CirMax = Math.max(CirMax + num, num);
            MaxSum = Math.max(CirMax, MaxSum);
            CirMin = Math.min(CirMin + num, num);
            MinSum = Math.min(CirMin, MinSum);
            Total += num;
        }
        return MaxSum > 0 ? Math.max(MaxSum, Total - MinSum) : MaxSum;
    }
    public static void main(String[] args) {
        int[] arr = {5, -3, -2, 5};
        System.out.println(SubArray(arr));
    }
}
