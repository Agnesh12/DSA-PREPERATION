package ArraysAndHashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int FindLongest(int[] arr) {
        HashSet<Integer> Check = new HashSet();
        for(int num : arr) {
            Check.add(num);
        }
        int Longest = 0;
        int Length;
        for (int num : Check) {
            if(!Check.contains(num - 1)) {
                Length = 1;
                while(Check.contains(num + Length)) {
                    Length++;
                }
                Longest = Math.max(Longest, Length);
            }
        }
        return Longest;
    }
    public static void main(String[] args) {
        int[] arr = {30, 10, 1, 4, 2, 3, 5};
        System.out.print(FindLongest(arr));
    }
}
