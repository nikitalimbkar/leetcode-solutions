class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> list = new ArrayList<>();
        int maxCandies = 0;

        for(int i=0; i<n; i++){
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }
        
        for(int i=0; i<n; i++){
            

            if(candies[i] + extraCandies >= maxCandies){
                   list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}