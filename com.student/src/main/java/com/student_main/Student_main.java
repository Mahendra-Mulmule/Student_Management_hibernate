package com.student_main;

import java.util.Scanner;
import com.student_info.Student;
import com.student_operation.Student_operation;


public class Student_main {
	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        Student_operation op = new Student_operation();

		        while (true) {
		            System.out.println("\n====== Student Management Menu ======");
		            System.out.println("1. Add Student");
		            System.out.println("2. View All Students");
		            System.out.println("3. Update Student");
		            System.out.println("4. Delete Student");
		            System.out.println("5. Exit");
		            System.out.print("Choose an option: ");
		            int choice = sc.nextInt();
		            sc.nextLine(); 

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Student Name: ");
		                    String name = sc.nextLine();
		                    System.out.print("Enter Student Class: ");
		                    String sclass = sc.nextLine();
		                    Student s = new Student(name, sclass);
		                    op.addStudent(s);
		                    break;

		                case 2:
		                    op.viewStudents();
		                    break;

		                case 3:
		                    System.out.print("Enter Student ID to Update: ");
		                    int uid = sc.nextInt();
		                    sc.nextLine();
		                    System.out.print("Enter New Name: ");
		                    String newName = sc.nextLine();
		                    System.out.print("Enter New Class: ");
		                    String newClass = sc.nextLine();
		                    op.updateStudent(uid, newName, newClass);
		                    break;

		                case 4:
		                    System.out.print("Enter Student ID to Delete: ");
		                    int did = sc.nextInt();
		                    op.deleteStudent(did);
		                    break;

		                case 5:
		                    System.out.println("exit ");
		                    sc.close();
		                    System.exit(0);

		                default:
		                    System.out.println("Invalid choice! Please select from the menu.");
		            }
		        }
		    }
		}

	
	


