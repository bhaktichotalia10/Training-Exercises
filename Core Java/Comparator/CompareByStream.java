package com.lesson3;

import java.util.Comparator;

public class CompareByStream implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStream().compareTo(o2.getStream());
	}
	

}
