package com.arrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//by using logic
		int start = 0;
		int end = list.size() - 1;

		while (start < end) {
			int num = list.get(start);
			list.set(start, list.get(end));
			list.set(end, num);
			start++;
			end--;
		}

		System.out.println(list);
		// by direct method
//		Collections.reverse(list);
//		System.out.println(list);
	}

}
