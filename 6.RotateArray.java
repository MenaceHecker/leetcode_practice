class Solution {
    public void rotate(int[] nums, int k) {
        System.out.print("[");
        int time= nums.length - k;
        for(int i=time; i<nums.length; i++)
        {
            System.out.print(nums[i]);
            System.out.print(",");
        }
        for(int j=0; j<time; j++)
        {
            System.out.print(nums[j]);
            if(j==(nums.length-k-1))
            {
                break;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }
}
