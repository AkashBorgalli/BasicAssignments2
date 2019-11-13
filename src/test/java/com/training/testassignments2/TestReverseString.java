package com.training.testassignments2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments2.ReverseString;

public class TestReverseString {

	@Test
	public void test() {
		String result = ReverseString.stringReverse("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc", result);
	}

}
