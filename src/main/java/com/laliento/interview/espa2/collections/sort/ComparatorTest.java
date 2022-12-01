package com.laliento.interview.espa2.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<Student2> lstStudent = new ArrayList<>();
		lstStudent.add(new Student2(1, "lalo", 34));
		lstStudent.add(new Student2(2, "lalo2", 28));
		lstStudent.add(new Student2(3, "lalo3", 35));
		lstStudent.add(new Student2(4, "lal4", 10));
		lstStudent.add(new Student2(5, "lal5", 23));

		System.out.println("Current list:");
		lstStudent.forEach(System.out::println);

		System.out.println("After natural order by age: ");
		Collections.sort(lstStudent, new Student2Comparator());
		lstStudent.forEach(System.out::println);

		System.out.println("After reverse order by age and LAMBDA: ");
		Collections.sort(lstStudent, (st1, st2) -> st2.getAge().compareTo(st1.getAge()));
		lstStudent.forEach(System.out::println);
	}
}

class Student2Comparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 student1, Student2 student2) {
		return student1.getAge().compareTo(student2.getAge());
	}
}

class Student2 {
	private Integer id;
	private String name;
	private Integer age;

	public Student2(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
