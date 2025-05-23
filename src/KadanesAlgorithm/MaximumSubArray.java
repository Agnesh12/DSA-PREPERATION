package KadanesAlgorithm;

public class MaximumSubArray {
    public static int Maximum(int[] arr) {
        int Sum = 0;
        int Max = Integer.MIN_VALUE;
        for(int num : arr) {
            Sum += num;
            if(Max < Sum) {
                Max = Sum;
            }
            if(Sum < 0) {
                Sum = 0;

            }
        }
        return Max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, -2, 7, 9};
        System.out.print(Maximum(arr));
    }
}
