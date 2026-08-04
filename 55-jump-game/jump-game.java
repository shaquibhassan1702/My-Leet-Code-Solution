class Solution {

    
    public boolean canJump(int[] nums) {

        
        int maxReach = 0;

        
        for (int i = 0; i < nums.length; i++) {

            
            if (i > maxReach) {
                return false;
            }

            
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        
        return true;
    }

    
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};
        int[] nums3 = {0};
        int[] nums4 = {2, 0, 0};
        int[] nums5 = {1, 1, 0, 1};

        System.out.println(obj.canJump(nums1)); 
        System.out.println(obj.canJump(nums2)); 
        System.out.println(obj.canJump(nums3)); 
        System.out.println(obj.canJump(nums4)); 
        System.out.println(obj.canJump(nums5)); 
    }
}