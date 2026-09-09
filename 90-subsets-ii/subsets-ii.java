class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(int index, int[] nums, List<Integer>current, List<List<Integer>>result){
        int n = nums.length;
        result.add(new ArrayList<>(current));
        for(int i=index; i<n; i++){
            current.add(nums[i]);
            backtrack(i+1,nums,current,result);
            current.remove(current.size()-1);

            int idx = i+1;
            while(idx < n && nums[idx] == nums[i]){
                idx++;
                
            }
            
            i = idx - 1;
        }
        
    }
}