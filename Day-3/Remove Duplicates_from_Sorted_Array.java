class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length,in=1;
        if(len==0)
        {
            return 0;
        }
        for(int i=1;i<len;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[in++]=nums[i];
            }
        }
        return in;
    }
}