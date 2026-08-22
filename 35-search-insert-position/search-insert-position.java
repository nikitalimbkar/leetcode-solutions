class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int st = 0, end = n-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                st = mid+1;
            }else{
                end = mid -1;
            }
        }
        return st;
    }
}