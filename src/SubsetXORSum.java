import java.util.ArrayList;

public class SubsetXORSum {

    public int subsetXORSum(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        backTrace(res, tmp, nums, 0);
        int sum = 0;
        for (int i=0; i<res.size(); i++) {
            ArrayList<Integer> list = res.get(i);
            int xor = 0;
            for (int n : list) {
                xor ^= n;
            }
            sum += xor;
        }
        return sum;
    }

    public void backTrace(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int[] nums, int index) {
        res.add(new ArrayList<>(tmp));
        for (int i=index; i<nums.length; i++) {
            tmp.add(nums[i]);
            backTrace(res, tmp, nums, i+1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        SubsetXORSum subsetXORSum = new SubsetXORSum();
        subsetXORSum.subsetXORSum(new int[]{5, 1, 6});
    }
}
