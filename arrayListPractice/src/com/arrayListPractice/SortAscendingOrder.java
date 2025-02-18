package com.arrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortAscendingOrder {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(34);
		list.add(133);
		list.add(6);
		list.add(3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
