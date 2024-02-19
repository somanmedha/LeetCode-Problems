package com.sm;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("aba"));
	}
	
	
	   public static int isPalindrome(String S) {
	        char[] sar= S.toCharArray();
	     
	        int isPalindromee= 0;
	        String revString="";
	        for(int i= sar.length -1;i>=0;i--)
	    {
	        revString=revString+sar[i];
	        
	    }
	    if(S.equals(revString))
	    isPalindromee=1;
	    
	    return isPalindromee;

	    }
	}


