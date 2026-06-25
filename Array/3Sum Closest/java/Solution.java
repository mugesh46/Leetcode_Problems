class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;
    Arrays.sort(arr);
    int res = arr[0] + arr[1] + arr[2];
    for(int i=0;i<n-2;i++){
        int left = i+1;
        int right = n-1;
        while(left < right){
            int sum = arr[i] + arr[left] + arr[right];
            if(Math.abs(target - sum) < Math.abs(target - res)){
                res = sum;
            }
            if(sum == target) return sum;
            else if(sum<target) left++;
            else right--;
        }
    }
    return res; 
    }
}