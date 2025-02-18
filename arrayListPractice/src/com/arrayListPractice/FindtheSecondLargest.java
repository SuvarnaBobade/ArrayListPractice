package com.arrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class FindtheSecondLargest {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(50);
		ar.add(111);
		ar.add(4);
		ar.add(3);
		ar.add(6);
		System.out.println(ar);
		Collections.sort(ar,Collections.reverseOrder());
		System.out.println(ar);
		if(ar.size()>1) {
			//here we can send or assign number which we want
			System.out.println("second largest element is:"+ ar.get(1));
		}else {
            System.out.println("List does not have enough elements to find the second largest.");

		}

	}

}
