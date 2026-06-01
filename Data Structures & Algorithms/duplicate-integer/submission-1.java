class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>count= new HashSet();
        for(int i=0;i<nums.length;i++){
            count.add(nums[i]);
        }
        if(count.size()==nums.length)
        return false;

        else
        return true;

    
    }
}