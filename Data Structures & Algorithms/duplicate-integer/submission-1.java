class Solution {
    public boolean hasDuplicate(int[] nums) {
          HashMap<Integer, Boolean> read = new HashMap<>();
        for (int num: nums){
            if (!read.containsKey(num)){
                read.put(num,false);
            }else{
                return true;
            }
        }
        return false;
    }
}