package com.git;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public void task() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.task();
		
		Set<Integer> s = new HashSet<>();
		s.add(100);
		s.add(200);
	}
}
