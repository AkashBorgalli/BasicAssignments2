package com.training.testassignments2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments2.Palindrome;

public class TestPalindrome {

	@Test
	public void test() {
	boolean result = 	Palindrome.checkPalindrome(121);
	assertEquals(true,result);
	}
	@Test
	public void test2() {
	boolean result = 	Palindrome.checkPalindrome(221);
	assertEquals(false,result);
	}
	@Test
	public void test3() {
	boolean result = 	Palindrome.checkPalindrome(-101);
	assertEquals(false,result);
	}
}
