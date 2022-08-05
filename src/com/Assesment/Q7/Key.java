package com.Assesment.Q7;

import java.util.ArrayList;
import java.util.HashMap;

public class Key {
	void sort(int[] a) {
		HashMap<Integer, String> ma = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			ma.put(a[i], null);
		}
		ArrayList<Integer> al = new ArrayList<>(ma.keySet());
		System.out.println(al);

	}
}
