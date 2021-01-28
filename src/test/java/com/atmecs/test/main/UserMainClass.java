package com.atmecs.test.main;


import java.util.Scanner;


import com.atmecs.test.operations.AddEmployee;
import com.atmecs.test.operations.DeleteBook;
import com.atmecs.test.operations.DisplayBook;
import com.atmecs.test.operations.UpdateBook;



public class UserMainClass {
	static int choice;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		do {
			System.out.println("Enter your Choice");
			System.out.println("1.Create Record\n2.Update Record\n3.Display records\n4.Delete Record\n5.Exit");
			System.out.println("=========================================================");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				AddEmployee add = new AddEmployee();
				add.addRecord();
				break;
			case 2:
				UpdateBook update = new UpdateBook();
				update.updateRecord();
				break;
			case 3:

				DisplayBook display = new DisplayBook();
				display.displayRecord();
				break;
			case 4:
				DeleteBook delete=new DeleteBook();
				delete.deleteRecord();
				break;
			
		case 5:
				System.out.println("You have pressed 3..The Program has been Ended..!!");
				System.out.println("============================================");
				break;

			default:
				System.out.println("Wrong Choice..!");
				System.out.println("============================================");

				break;
			}
		} while (choice != 5);
	}

}
