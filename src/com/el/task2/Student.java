package com.el.task2;

public class Student {
	 int id;
	    String name;
	    double marks;

	    Student(int id, String name, double marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	    }

	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
	    }

}
