package com.arrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MergeTwoArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<>();
		arl.add(21);
		arl.add(12);
		arl.add(34);
		arl.add(9);
		int i;
		for (i = 0; i < arl.size(); i++) {
			System.out.println(arl.get(i));
		}
		System.out.println("first list");
		System.out.println(arl);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(2);
		ar.add(4);
		ar.add(100);
		ar.add(9);
		int j;
		for (j = 0; j < ar.size(); j++) {
			System.out.println(ar.get(j));
		}
		System.out.println("second list");
		System.out.println(ar);
		// by using hashset we can also remo duplicates
//		HashSet<Integer> set = new HashSet<>(arl);
//		set.addAll(ar);
		ArrayList<Integer> list = new ArrayList<>(arl);
		for (Integer num : ar) {
			if (!list.contains(num)) {
				list.add(num);
			}
		}

		System.out.println("without duplicate list");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("sorted list");
		System.out.println(list);

	}

}
