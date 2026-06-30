class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        // ans =0;
      for(int i=0;i<nums.length;i++){
        for(int j=nums.length-1;j>0;j--){
            if(nums[i]<nums[j]){
                        max = Math.max(max, nums[j]);            }
          int height = Math.min(nums[i], nums[j]);
                      int width = j - i;
                      int   area = height * width;
        max = Math.max(max, area);
        }
      }
      return max;

    }
}