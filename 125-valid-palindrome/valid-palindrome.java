class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int st = 0, end = n-1;
        
      
        while(st <= end){
            if(!isAlphanum(s.charAt(st))){
                st++; continue;
            }
            if(!isAlphanum(s.charAt(end))){
                end--; continue;
            }
            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
               return false;
        } 
        st++;
        end--;
    }
    return true;
}
public  boolean isAlphanum(char ch){
    if((ch >= '0' && ch<='9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<= 'Z')){
        return true;
    }
    return false;
}
}