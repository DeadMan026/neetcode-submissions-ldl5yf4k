class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int r = newS.length() - 1;

        while(l<r){
            if(newS.charAt(l) != newS.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;  
    }
}
