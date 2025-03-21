

import java.util.*;

class ZeroSum_Subarrays {
    public static List<int[]> ZeroSum_Subarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(Arrays.copyOfRange(arr, start + 1, i + 1));
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6, -3, 3};
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        for (int[] sub : subarrays) {
            System.out.println(Arrays.toString(sub));
        }
    }
}

