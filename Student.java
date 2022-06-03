package org.student;

import org.department.Department;
import org.college.College;

public class Student extends Department{
		public void studentName() {
			System.out.println("Student Name : Ram");
		}
		public void studentDept() {
			System.out.println("Student Department : Computers");
		}
		public void studentId() {
			System.out.println("Student Id : 3333");
		}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
	
	}
	private void collegeRank() {
		// TODO Auto-generated method stub
		
	}
	private void collegeCode() {
		// TODO Auto-generated method stub
		
	}
	private void collegeName() {
		// TODO Auto-generated method stub
		
	}		
	}