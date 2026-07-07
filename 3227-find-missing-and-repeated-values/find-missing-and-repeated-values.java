class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n*n;
        long expectedSum = (long) total * (total+ 1)/2;
        long expectedSqrSum = (long) total * (total+ 1) * (2* total + 1)/6;

        long actualSum = 0, actualSqrSum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                actualSum += grid[i][j];
                actualSqrSum+= (long) grid[i][j]*grid[i][j];

            }
        }
        long diffSum = actualSum - expectedSum;
        long diffSqrSum = actualSqrSum - expectedSqrSum;

        long sumAB = diffSqrSum / diffSum;

        int a = (int) (sumAB + diffSum) /2;
        int b = (int) (sumAB - diffSum) /2;

        return new int[]{a,b};
    }
}