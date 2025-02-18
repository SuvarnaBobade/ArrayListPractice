package com.arrayListPractice;

import java.util.ArrayList;

public class ArrayListtoArrayConversion {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println(list);
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		System.out.println("array");
		for (int num : array) {
			System.out.println(num + " ");
		}

	}

}
