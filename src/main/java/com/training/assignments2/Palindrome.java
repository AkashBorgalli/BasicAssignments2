package com.training.assignments2;

public class Palindrome {

	public static boolean checkPalindrome(int number) {
		boolean flag = false;
		if(number>0) {
		int reversedInteger = 0, remainder, originalInteger;
        originalInteger = number;
        // reversed integer is stored in variable 
        while( number != 0 )
        {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            flag=true;
        else
            flag=false;
		}
		return flag;
		
		
	}
	

}
