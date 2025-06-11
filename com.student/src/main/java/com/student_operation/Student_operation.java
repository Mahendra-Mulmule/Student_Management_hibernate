package com.student_operation;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.student_info.Student;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Student_operation {
	//this package for creating all the opration here to make code simple and easy to use 
	
	    private static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

	    //add student
	    public void addStudent(Student student) {
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(student);
	        tx.commit();
	        session.close();
	        System.out.println("Student Added Successfully!");
	    }

	    //view student
	    public void viewStudents() {
	        Session session = factory.openSession();
	        List<Student> students = session.createQuery("from Student", Student.class).list();
	        for (Student s : students) {
	            System.out.println(s);
	        }
	        session.close();
	    }

	    //update student
	    public void updateStudent(int id, String newName, String newClass) {
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        Student student = session.get(Student.class, id);
	        if (student != null) {
	            student.setStudentName(newName);
	            student.setStudentClass(newClass);
	            session.update(student);
	            tx.commit();
	            System.out.println("Student Updated Successfully!");
	        } else {
	            System.out.println("Student Not Found.");
	        }
	        session.close();
	    }

	    //delete student
	    public void deleteStudent(int id) {
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        Student student = session.get(Student.class, id);
	        if (student != null) {
	            session.delete(student);
	            tx.commit();
	            System.out.println("Student Deleted Successfully!");
	        } else {
	            System.out.println("Student Not Found.");
	        }
	        session.close();
	    }
	}


