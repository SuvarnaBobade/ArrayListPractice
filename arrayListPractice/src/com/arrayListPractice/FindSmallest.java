package com.arrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class FindSmallest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3129);
		list.add(3);
		list.add(29);
		list.add(32);
		list.add(9);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		if (list.size() > 1) {
			System.out.println("samllest element:" + list.get(0));

		} else {
			System.out.println("there is no elements present in list");
		}

	}

}
