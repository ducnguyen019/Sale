package com.vti.lesson05;

public class Program05 {

	public static void main(String[] args) {

//		IStudy p1 = new Student("Nguyen Van A", 20);
//		p1.copyHomework();
//		p1.doHomework();
//		p1.rollUp();
//
//		Person p2 = new Student("Nguyen Van B", 21);
//		((IStudy) p2).copyHomework();
//		((IStudy) p2).doHomework();

		Person p1 = new Student("Teo", 25);
		Person p2 = new Student("Ti", 24);
		Person t1 = new Teacher("Thanh", 35, "Toan");
		Person t2 = new Teacher("Tuan", 40, "Hoa");

		Person[] persons = new Person[4];
		persons[0] = p1;
		persons[1] = t1;
		persons[2] = p2;
		persons[3] = t2;

//			for(Person p : persons) {
//				p.rollUp();
//			}
		for (Person p : persons) {
			if (p instanceof Teacher) {
				Teacher t = (Teacher) p;
				t.teach();
			}
		}

	}

}
