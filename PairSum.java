package week3_assignment2;

import java.util.*;

class PairSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 12, 5};
        int target = 9;
        System.out.println(hasPairWithSum(arr, target));
    }
}

