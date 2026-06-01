class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int x = 2*l;

        int[] ans = new int[x];
        for(int i=0;i<l;i++){
            ans[i]=nums[i];
        }
        int j=0;

        for(int i=l;i<x;i++){
            
            ans[i]=nums[j];
            j++;
        }

        return ans;
    }
}