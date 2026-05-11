class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] seen = new int[n];

        for(int i=0;i<n;i++){
            int idx = nums[i]-1;
            if(seen[idx] > 0 )return nums[i];
            seen[idx]++;
        }

        return -1;
    }
}
