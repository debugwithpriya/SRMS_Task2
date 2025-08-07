package com.el.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n1. Add Student\n2. View Students\n3. Update Student\n4. Delete Student\n5. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Marks: ");
				double marks = sc.nextDouble();
				list.add(new Student(id, name, marks));
				break;

			case 2:
				for (Student s : list) {
					System.out.println(s);
				}
				break;

			case 3:
				System.out.print("Enter ID to update: ");
				int uid = sc.nextInt();
				for (Student s : list) {
					if (s.id == uid) {
						sc.nextLine();
						System.out.print("New Name: ");
						s.name = sc.nextLine();
						System.out.print("New Marks: ");
						s.marks = sc.nextDouble();
						break;
					}
				}
				break;

			case 4:
				System.out.print("Enter ID to delete: ");
				int did = sc.nextInt();
				list.removeIf(s -> s.id == did);
				break;

			case 5:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 5);

		sc.close();

	}

}
