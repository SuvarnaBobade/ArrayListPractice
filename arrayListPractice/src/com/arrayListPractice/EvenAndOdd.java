package com.arrayListPractice;

import java.util.ArrayList;

public class EvenAndOdd {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(3);
		list.add(7);
		list.add(3);
		list.add(2);
		System.out.println(list);
		int sum = 0;
		int sumOdd=0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.println("even");
				sum+=list.get(i);
			} else {
				System.out.println("Odd");
				sumOdd+=list.get(i);
			}
			
		}
		System.out.println(sum);
		System.out.println(sumOdd);

	}

}
