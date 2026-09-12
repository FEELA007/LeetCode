class Solution {
    public boolean isPalindrome(int x) {
        int t=x,re,r=0;
        if(t<0){
            return false;
        }
        
        while(x!=0){
            re=x%10;
            r=(r*10)+re;
            x/=10;
        }
        if(t==r)
        return true;
        else
        return false;
    }
}