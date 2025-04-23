import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n;
        int val=0;
        for(int i=m; i<total; i++)
        {
            nums1[i]=nums2[val];
            val++;
        }
        System.out.print("[");
        Arrays.sort(nums1);
        for(int j=0; j<total; j++)
        {
            System.out.print(nums1[j]);
            if(j==total-1)
            {
                continue;
            }
            System.out.print(",");
        }
    }
}