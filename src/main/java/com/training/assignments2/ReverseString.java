package com.training.assignments2;

public class ReverseString {

	public static String stringReverse(String string) {
		String words[] = string.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
		
	}

}
