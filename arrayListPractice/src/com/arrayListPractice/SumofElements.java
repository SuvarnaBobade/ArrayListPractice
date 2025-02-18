package com.arrayListPractice;

import java.util.ArrayList;

public class SumofElements {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		System.out.println("total list:" + list);
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
	}

}
