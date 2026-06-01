class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []pos=new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(map.containsKey(diff)){
                pos[0]=map.get(diff);
                pos[1]=i;
                if(pos[0]!=pos[1])
                break;
                else 
                continue;
                

            }
            map.put(nums[i],i);
        }


    return pos;
        
    }
}
