package com.josh.java.Training.collection.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		/* comparator operation */
		List<StudentComparator> stu = new ArrayList<StudentComparator>();
		stu.add(new StudentComparator("Anirudh", 3));
		stu.add(new StudentComparator("Lohith", 2));
		stu.add(new StudentComparator("Jeevan", 1));
		/* this is calling method and creating object for Age Sort class */
		Collections.sort(stu, new SortAge());
		for (StudentComparator a : stu) {
			System.out.println(a);
		}
		System.out.println("......................\n");
		/* this is calling method and creating object for Name Sort class */
		Collections.sort(stu, new NameSort());
		for (StudentComparator a1 : stu) {
			System.out.println(a1);
		}

		/* comparable operation */
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Jeevan", 23));
		al.add(new Student(106, "Ani", 27));
		al.add(new Student(105, "Gireesh", 21));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
