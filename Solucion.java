/*
Given a signed 32-bit integer x, return x with its digits reversed.
 If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
*/



class Solution {
    public int reverse(int x) {
         int res = 0;
        boolean pos = true;
	    if(x < 0){
	        pos = false;
	    }
	    String val = String.valueOf(x);
	    String [] arr = val.split("-",-1);
	    val="";
	    for(String a: arr){
	        val += a;
	    }
        System.out.println(val);
        
        String buf = "";
        for(int i = 0; i < val.length();i++ ){
    
            buf += val.charAt(val.length() - 1 - i);
        }
        double ser = Double.parseDouble(buf);
        if(ser < Integer.MAX_VALUE){
            res =  Integer.parseInt(buf);
        }
        
        if(!pos){
            res *= -1; 
        }
        return res;
        
    }
}