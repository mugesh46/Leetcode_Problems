class Solution {
    public boolean containsDuplicate(int[] nums) {
      for(int i=0;i<=nums.length-1;i++){
        for(int j=i+1;j<nums.length;i++){
            if(nums[i]==nums[j]){
                return true;
            }
            else {
                return false;
            }
        }
      }
      return false;
    }
}