class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0)
            return false;
        int halfReverse=0;
        while(x>halfReverse){
            halfReverse= halfReverse*10+x%10;
            x=x/10;
        }
        if(x==halfReverse || x==halfReverse/10)
            return true;
        else
            return false;
        
    }
}

// using integer


class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        String s= Integer.valueOf(x).toString();
        int start =0;
        int end= s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
        
    }
}

//using string