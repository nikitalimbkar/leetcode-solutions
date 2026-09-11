class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), result,used);
        return result;
    }
    public void backtrack(int[] nums, List<Integer>ans, List<List<Integer>>result,boolean[] used){
        if(ans.size() == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && used[i-1] == false){
                continue;
            }
            ans.add(nums[i]);
            used[i] = true;
            backtrack(nums,ans,result,used);
            ans.remove(ans.size() - 1);

            used[i] = false;
        }
    }
}