package org.test;

import java.util.ArrayList;
import java.util.List;

public class generics {
	public static void main(String[] args) {
		List<Integer>li = new ArrayList ();
		li.add(10);
		li.add(20);
		li.add(80);
		li.add(10);
		li.add(50);
		System.out.println(li);
		int si= li .size();
		System.out.println(si);
		int k = li.indexOf(30);
		System.out.println(k);
		int f = li.lastIndexOf(80);
		System.out.println(f);
		int j = li.remove(3);
		System.out.println(j);
		int l = li.set(2, 80);
		System.out.println(l);
		int y = li.get(2);
		System.out.println(y);
		List <Integer>si1= new ArrayList();
		System.out.println(si1);
            boolean n = si1.isEmpty();
            System.out.println(n);
            
		
	
	}

}
