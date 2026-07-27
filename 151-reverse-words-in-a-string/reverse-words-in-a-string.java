class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        
        reverse(arr, 0, n - 1);

        int i = 0, right = 0, left = 0;

        while (i < n) {

            
            while (i < n && arr[i] == ' ') i++;

            if (i == n) break;

            
            while (i < n && arr[i] != ' ') {
                arr[right++] = arr[i++];
            }

            
            reverse(arr, left, right - 1);

            
            
            if (right < n) {
                arr[right++] = ' ';
            }
            left = right;
        }

        
        return new String(arr, 0, right).trim();
    }

    private void reverse(char[] arr, int st, int end) {
        while (st < end) {
            char temp = arr[st];
            arr[st++] = arr[end];
            arr[end--] = temp;
        }
    }
}