package com.arrayListPractice;

import java.util.ArrayList;

public class FindtheIndexofanElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(23);
		list.add(7);
		list.add(20);
		System.out.println(list);
			int target =20;
			int index= list.indexOf(target);
			if(index != -1) {
				  System.out.println("Element " + target + " found at index: " + index);
	        } else {
	            System.out.println("Element " + target + " not found.");
	        }
		}
	}


