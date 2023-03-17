package org.techhub;

public class College {
 private Student student;

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public void show() {
	System.out.println(student.getSal()+"\t"+student.getName()+"\t"+student.getId());
}
}
