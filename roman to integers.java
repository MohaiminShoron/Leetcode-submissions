class Solution {

    public int mapNumber(char c){
        switch (c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        for(int i =0;i<s.length();i++){
            if(i!=s.length()-1 && mapNumber(s.charAt(i))<mapNumber(s.charAt(i+1))){
                sum+=mapNumber(s.charAt(i+1))-mapNumber(s.charAt(i));
                i++;
            }
            else {
                sum+=mapNumber(s.charAt(i));
            }
        }
        return sum;
    }



        public int romanToInt2(String s) {
        int sum=0;
        for(int i =0; i<s.length()-1;i++){
            if(s.charAt(i)=='M'){
                sum+=1000;
            }
            else if(s.charAt(i)=='D'){
                sum+=500;
            }
            else if(s.charAt(i)=='C'){
                if(s.charAt(i+1)=='D'){
                    sum+=400;
                    i++;
                }
                else if(s.charAt(i+1)=='M'){
                    sum+=900;
                    i++;
                }
                else {
                    sum+=100;
                }
            }
            else if(s.charAt(i)=='L'){
                sum+=50;
            }
            else if(s.charAt(i)=='X'){
                if(s.charAt(i+1)=='L'){
                    sum+=40;
                    i++;
                }
                else if(s.charAt(i+1)=='C'){
                    sum+=90;
                    i++;
                }
                else{
                    sum+=10;
                }
            }
            else if(s.charAt(i)=='V'){
                sum+=5;
            }
            else{
                if(s.charAt(i+1)=='X'){
                    sum+=9;
                }
                else if(s.charAt(i+1)=='V'){
                    sum+=4;
                }
                else {
                    sum+=1;
                }
            }
        }
        if(s.charAt(s.length()-1)==)
        return sum;
    }
}
