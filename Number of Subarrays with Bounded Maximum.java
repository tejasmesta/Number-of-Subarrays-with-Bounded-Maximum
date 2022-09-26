class Solution {
    public int numSubarrayBoundedMax(int[] nums, int l, int r) 
    {
        int i = 0;
        int j = 0;
        int m = 0;
        int count = 0;
        int n = nums.length;
        
        while(j<n)
        {
            if(nums[j]>r)
            {
                m = 0;
                i = j+1;
            }
            else if(nums[j]>=l && nums[j]<=r)
            {
                m = j-i+1;
            }
            count+=m;
            j++;
        }
        
        return count;
    }
}
