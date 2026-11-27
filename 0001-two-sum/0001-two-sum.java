class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            int x = target - nums[i];
            
            if(seen.containsKey(x))
            {
                return new int[] {seen.get(x), i};
            }
            seen.put(nums[i], i);

        }
        return new int[]{};
    }
}