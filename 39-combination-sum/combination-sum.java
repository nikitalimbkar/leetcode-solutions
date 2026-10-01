class Solution {

    void getAllCombinations(
        int[] candidates,
        int idx,
        int target,
        List<List<Integer>> ans,
        List<Integer> combine
    ) {

        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }

        if (idx == candidates.length || target < 0) {
            return;
        }

        
        combine.add(candidates[idx]);

        getAllCombinations(
            candidates,
            idx,
            target - candidates[idx],
            ans,
            combine
        );

        
        combine.remove(combine.size() - 1);

        
        getAllCombinations(
            candidates,
            idx + 1,
            target,
            ans,
            combine
        );
    }

    public List<List<Integer>> combinationSum(
        int[] candidates,
        int target
    ) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();

        getAllCombinations(
            candidates,
            0,
            target,
            ans,
            combine
        );

        return ans;
    }
}