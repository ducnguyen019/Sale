package com.vti.lesson09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Program9 {

	static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		/*
		 * //<>: generic List<String> names = new ArrayList<>();
		 * System.out.println("Size1 = " + names.size()); names.add("Nam");
		 * names.add("Teo"); names.add("Ti");
		 * 
		 * System.out.println("Size2 = " + names.size());
		 * System.out.println("Index 1 = " + names.get(1)); names.set(1, "Le Van Teo");
		 * System.out.println("Index 1 = " + names.get(1)); names.remove(1);
		 * System.out.println("Index 1 = " + names.get(1)); //for each for(String name :
		 * names) { System.out.println(name); } //for for(int i= 0; i < names.size();
		 * i++) { System.out.println(names.get(i)); }
		 * 
		 * int j = 0; while(j < names.size()) { System.out.println(names.get(j)); j++; }
		 */

//		for (int i = 1; i <= 5; i++) {
//			Student s = new Student();
//			s.setId(i);
//			if (i <= 3) {
//				s.setName("Same Name");
//			} else {
//				s.setName("Name " + i);
//			}
//			students.add(s);
//		}
//
//		// a.
//		System.out.println("Total = " + students.size());
//		// b.
//		System.out.println(students.get(3));
//		// c.
//		System.out.println(students.get(0));
//		System.out.println(students.get(students.size() - 1));
//		// d.
//		Student s0 = new Student();
//		s0.setId(0);
//		s0.setName("Name 0");
//		students.add(0, s0);
//		Student ss = new Student();
//		ss.setId(6);
//		ss.setName("Name 6");
//		students.add(ss);
//
//		for (Student si : students) {
//			System.out.println(si);
//		}
//
//		List<Student> reverseStd = new ArrayList<>();
//		for (int i = students.size() - 1; i >= 0; i--) {
//			reverseStd.add(students.get(i));
//		}
//
//		for (Student sr : reverseStd) {
//			System.out.println(sr);
//		}
//
//		System.out.println("Result = " + findById(10));

//		Stack<Student> stack = new Stack<>();
//		stack.push(s0);
//		Queue queue = new Queue();

//		Set<Integer> numbers = new HashSet<Integer>();
//		numbers.add(10);
//		numbers.add(8);
//		numbers.add(3);
//
//		int i = 0;
//		for (Integer num : numbers) {
//			if (i == 2) {
//				System.out.println(num);
//			}
//			i++;
//		}
//
//		Iterator<Integer> iter = numbers.iterator();
//
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}

		// Map
		Map<Integer, Student> stdMap = new HashMap<>();
		Student s1 = new Student(1, "Le Van Teo");
		Student s2 = new Student(2, "Nguyen Van Ti");
		Student s3 = new Student(10, "Tran Van Tuan");
		stdMap.put(1, s1);
		stdMap.put(2, s2);
		stdMap.put(3, s2);
		stdMap.put(3, s3);

		// System.out.println(stdMap.get(2));
		// System.out.println("Size = " + stdMap.size());

		// Key
		for (Integer key : stdMap.keySet()) {
			System.out.println(key);
		}

		// Value
		for (Student std : stdMap.values()) {
			System.out.println(std);
		}

		// key value
		for (Integer key : stdMap.keySet()) {
			System.out.println("Key = " + key);
			System.out.println("Value = " + stdMap.get(key));
		}

//		List<Student> stds = new ArrayList<>();
//
//		Student s1 = new Student(6, "Le Van Teo");
//		Student s2 = new Student(16, "Nguyen Van Ti");
//		Student s3 = new Student(10, "Tran Van Tuan");
//		Student s4 = new Student(3, "Pham Van Lam");
//
//		stds.add(s1);
//		stds.add(s2);
//		stds.add(s3);
//		stds.add(s4);
//
//		for (Student s : stds) {
//			System.out.println(s);
//		}
//
//		Collections.sort(stds);
//
//		for (Student s : stds) {
//			System.out.println(s);
//		}

		// Ex01_Q7
		Collection<Student> stdColection = stdMap.values();
		List<Student> stdList = new ArrayList<>(stdColection);
		Collections.sort(stdList);
	}

	public static Student findById(int inputId) {
		for (Student s : students) {
			if (s.getId() == inputId) {
				return s;
			}
		}
		return null;
	}

}
