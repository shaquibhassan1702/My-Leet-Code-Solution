import java.util.*;

class Solution {

    public static void subsetfunc(int[] nums, int index, List<Integer> sublist, List<List<Integer>> ans) {
        // Add current subset
        ans.add(new ArrayList<>(sublist));

        for (int i = index; i < nums.length; i++) {
            // Include element
            sublist.add(nums[i]);

            // Recursive call
            subsetfunc(nums, i + 1, sublist, ans);

            // 🔁 Backtrack (IMPORTANT FIX)
            sublist.remove(sublist.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsetfunc(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}