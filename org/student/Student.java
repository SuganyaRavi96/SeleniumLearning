package org.student;

import org.department.Department;

public class Student extends Department {
	// studentName(),studentDept(),studentId()
	public void studentName() {
		System.out.println("Student name is Suganya");
	}
	public void studentDept() {
		System.out.println("student department is ECE");
	}
	public void studentId() {
		System.out.println("Student Id is 10");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();

	}
}
