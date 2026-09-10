class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }
    public void backtrack(int[] nums, List<Integer>ans, List<List<Integer>>result){
        if(ans.size() == nums.length){
            result.add(new ArrayList<>(ans));
        }else{
            for(int i=0; i<nums.length; i++){
                if(ans.contains(nums[i])) continue;
                ans.add(nums[i]);
                backtrack(nums,ans,result);
                ans.remove(ans.size()-1);
            }
        }
    }
}