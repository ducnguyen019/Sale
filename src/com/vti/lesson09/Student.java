package com.vti.lesson09;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "|Id: " + getId() + " |Name: " + getName();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.id == s.getId() && this.name.equals(s.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.id + this.name.hashCode();
	}

	public int compareTo(Student o) {
		if (this.id > o.getId()) {
			return -1;
		} else if (this.id < o.getId()) {
			return 1;
		}
		return 0;
	}

	public int compares(Student o1, Student o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			if (o1.getId() < o2.getId()) {
				return -1;
			} else if (o1.getName().compareTo(o2.getName()) > 0) {
				return 1;
			} else {
				if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}

}
