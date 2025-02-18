package com.arrayListPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(34);
		list1.add(54);
		list1.add(50);
		list1.add(90);
		System.out.println("first list:" + list1);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(35);
		list2.add(55);
		list2.add(50);
		list2.add(90);
		System.out.println("second list:" + list2);

		ArrayList<Integer> list3 = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>(list1);
		for (Integer num : list2) {
			if (set.contains(num) && !list3.contains(num)) {
				list3.add(num);
			}
		}
		System.out.println(list3);

	}

}
