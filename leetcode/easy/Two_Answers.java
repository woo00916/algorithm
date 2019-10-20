class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] answer = new int[2];
        
        for(int i=0; i<nums.length;i++){
            //if exist two target/2 in elements, return the index
            if(nums[i]==target/2 && hm.get(nums[i])!=null){
                answer[0]=hm.get(nums[i]);
                answer[1]=i;
                return answer;
            }
            
            //put all element into hashmap
            hm.put(nums[i],i);
        }
        
        //find corresponding indexes
        for(Integer key : hm.keySet()){
            if(hm.get(target-key)!=null){
                answer[0]=hm.get(key);
                answer[1]=hm.get(target-key);
                break;
            }
        }
        
        return answer;
        
    }
}
