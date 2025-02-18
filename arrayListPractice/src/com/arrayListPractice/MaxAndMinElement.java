package com.arrayListPractice;

import java.util.ArrayList;

public class MaxAndMinElement {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(12);
		ar.add(10);
		ar.add(143);
		ar.add(23);
		ar.add(1);
		System.out.println(ar);
		int min = ar.get(0);
		for (int i = 1; i < ar.size(); i++) {
			if (ar.get(i) < min) {
				min = ar.get(i);
			}
		}
		System.out.println("minimum number is:" + min);
		int max = ar.get(0);
		for (int j = 1; j < ar.size(); j++) {
			if (ar.get(j) > max) {
				max = ar.get(j);
			}
		}
		System.out.println("Maximum number:" + max);
	}
}
