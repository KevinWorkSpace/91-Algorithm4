import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class FindSumPairs {

    int[] nums1 = null;
    int[] nums2 = null;
    HashMap<Integer, Integer> map = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int i=0; i<nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map.put(nums2[i], map.get(nums2[i]) + 1);
            }
            else map.put(nums2[i], 1);
        }
    }

    public void add(int index, int val) {
        map.put(nums2[index], map.get(nums2[index]) - 1);
        nums2[index] += val;
        if (map.containsKey(nums2[index])) {
            map.put(nums2[index], map.get(nums2[index]) + 1);
        }
        else map.put(nums2[index], 1);
    }

    public int count(int tot) {
        int cnt = 0;
        for (int i=0; i<nums1.length; i++) {
            if (map.containsKey(tot - nums1[i])) {
                cnt += map.get(tot - nums1[i]);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        FindSumPairs sumPairs = new FindSumPairs(new int[2], new int[2]);
        System.out.println(sumPairs.count(32));
    }

}
