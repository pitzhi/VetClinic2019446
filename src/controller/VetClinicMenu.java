package controller;

import java.util.Scanner;

import animal.Animals;
import staff.Staff;

public class VetClinicMenu {
	
	Helper hel;
	
	public VetClinicMenu(){
		hel = new Helper();
		hel.staffList();
		hel.animalsList();
		welcomeMenu();
	
	}
	//The main menu contains the options that the user wants to check.
	public void welcomeMenu() {

		System.out.println("*****************************************");
		System.out.println("*                                       *");
		System.out.println("*       WELCOME TO THE VET CLINIC       *");
		System.out.println("*                                       *");
		System.out.println("*****************************************");
		System.out.println("What information would you like to consult:");
		System.out.println("Press 1 - Aninals");
		System.out.println("Press 2 - Staff");
		Scanner myScanner = new Scanner(System.in);
		String option = myScanner.next();
		//The menu if user select 1 -Aninals
		if (option.equals("1")) {

			System.out.println("Animal list:");
			System.out.println("Press 1: for List all animals");
			System.out.println("Press 2: for List animals by category");
			System.out.println("Press 3: for Search for a specific animal by name ");

			String animalOption = myScanner.next();

			if (animalOption.equals("1")) {
				hel.printAnimals(hel.animalsList());
			}

			else if (animalOption.equals("2")) {

				typeAnimals();
			}

			else if (animalOption.equals("3")) {

				System.out.println("Please insert animal Name");
				String animalName = myScanner.next();
				Animals an = hel.searchAnimal(animalName);
				//correct name
				if (an != null) {
					System.out.println("Animal ID: " + an.getAnimalId() + "\n" + "Animal Name: " + an.getAnimalName() + "\n"
							+ "Animal Type: " + an.getAnimalType() + "\n" + "Age: " + an.getAnimalAge() + "\n" + "Medical Condition: "
							+ an.getMedicalCondition() + "\n");
				}
				//not correct name
				else {
					System.out.println(animalName.toUpperCase() + " is not found");
				}
			}
			//select wrong number
			else {
				System.out.println("Invalid option. Please insert number 1, 2 or 3");
			}

		}
		//The menu if user select 2 -Staffs
		else if (option.equals("2")) {
			System.out.println("Staff list:");
			System.out.println("Press 1: for List all staffs");
			System.out.println("Press 2: for List Staffs by category");
			System.out.println("Press 3: for search the a specific staff by name");
			System.out.println("Press 4: for staff working at the moment");
			
			String staffOption = myScanner.next();
			
			if (staffOption.equals("1")) {
				hel.printStaff();
			}
			else if (staffOption.equals("2")) {
				categoryOptions();
			}
			else if (staffOption.equals("3")) {

				System.out.println("Please insert staff Name");
				String staffName = myScanner.next();
				Staff st = hel.searchStaff(staffName);

				if (st != null) {
					System.out.println("Staff ID: " + st.getId() + "\n" + "Staff Name: " + st.getName() + " "
							+ st.getSurname() + "\n" + "Staff Category: " + st.getClass().getSimpleName() + "\n"
							+ "Salary : " + st.getSalary() + "\n");
				}

				else {
					System.out.println(staffName.toUpperCase() + " is not found");
				}
			
			}
			else if (staffOption.equals("4")) {
				hel.tasks();
			}
			else {
				System.out.println("Invalid option. Please insert number 1, 2, 3 or 4. ");
			}

		}
		else {
			System.out.println("Please select a valid number. 1 or 2");
			welcomeMenu();
		}
	}
	//category Options	1 to 5
	public void categoryOptions() {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Select one of the categories below:");
		System.out.println("1 - Receptionist");
		System.out.println("2 - Engineer");
		System.out.println("3 - Nurses");
		System.out.println("4 - Veterinarian");
		System.out.println("5 - Trainee");
	
		String categoryOption = myScanner.next();

		if (categoryOption.equals("1")) {
			String category = "receptionist";
			hel.searchByCategory(category);
		}

		else if (categoryOption.equals("2")) {
			String category = "engineer";
			hel.searchByCategory(category);
		}

		else if (categoryOption.equals("3")) {
			String category = "nurse";
			hel.searchByCategory(category);
		}

		else if (categoryOption.equals("4")) {
			String category = "veterinarian";
			hel.searchByCategory(category);
		}

		else if (categoryOption.equals("5")) {
			String category = "trainee";
			hel.searchByCategory(category);
		}
		else {
			System.out.println("Invalid option. Please insert number 1, 2, 3, 4 or 5.");
			categoryOptions();
		}

	}
	// type Animals 1 to 4
	public void typeAnimals() {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Select one of the types below:");
		System.out.println("Press 1: for List all Dogs");
		System.out.println("Press 2: for List all Cats");
		System.out.println("Press 3: for List all Snakes");
		System.out.println("Press 4: for List all Birds");

		String categoryOption = myScanner.next();

		if (categoryOption.equals("1")) {
			String type = "Dog";
			hel.searchByCategoryAnimal(type);
		}

		else if (categoryOption.equals("2")) {
			String type = "Cat";
			hel.searchByCategoryAnimal(type);
		}

		else if (categoryOption.equals("3")) {
			String type = "Snake";
			hel.searchByCategoryAnimal(type);
		}

		else if (categoryOption.equals("4")) {
			String type = "Bird";
			hel.searchByCategoryAnimal(type);
		}

		else {
			System.out.println("Invalid option. Please insert number 1, 2, 3 or 4.");
			typeAnimals();
		}

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VetClinicMenu();

	}

}
