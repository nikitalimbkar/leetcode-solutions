class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        int m = part.length();

        char[] arr = s.toCharArray();

        for(char ch : arr){
            res.append(ch);
            if(res.length() >= m){
            if(res.substring(res.length() - m).equals(part)){
                res.delete(res.length() - m, res.length());
            }
            }
        }
        return res.toString();
    }
}