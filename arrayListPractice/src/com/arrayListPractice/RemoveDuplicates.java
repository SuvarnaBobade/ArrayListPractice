package com.arrayListPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(12);
		ar.add(11);
		ar.add(13);
		ar.add(12);
		System.out.println(ar);
		HashSet<Integer> set = new HashSet<>();
		set.addAll(ar);
		System.out.println(set);
		ArrayList<Integer> duplicate = new ArrayList<>();
		for (Integer num : ar) {
			if (!duplicate.contains(num)) {
				duplicate.add(num);
		}
		}
		System.out.println(duplicate);
	}

}
