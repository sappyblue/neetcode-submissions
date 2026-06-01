class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>set1=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set1.add(nums[i]);
        }

        if(set1.size()==nums.length){
            return false;
        }
        else
        return true;
    }
}