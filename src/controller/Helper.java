package controller;

import java.util.ArrayList;

import animal.*;
import staff.*;

public class Helper {
	
	static Staff[] staffList = new Staff[50];
	static Animals[] animalsList = new Animals[800];
	
	private ArrayList<Animals> nurse = new ArrayList<>();
	private ArrayList<Animals> engineer = new ArrayList<>();
	private ArrayList<Animals> receptionist = new ArrayList<>();
	private ArrayList<Animals> trainee = new ArrayList<>();
	private ArrayList<Animals> veterinarian = new ArrayList<>();
	
	static StaffFactory myStaffFactory = new StaffFactory();
	static AnimalFactory myAnimalFactory = new AnimalFactory();
	
	public Staff[] staffList() {

		// Recepcionist
		for (int i = 0; i < 10; i++) {
			String staffName = myStaffFactory.getRandomName();
			String tasks = myStaffFactory.getRandomTasks();
			String[] nameParts = staffName.split(" ");
			Staff list = new Receptionist(nameParts[0], nameParts[1], tasks, "", i, 0);
			staffList[i] = list;
		}
		//Engineer
		for (int i = 10; i < 20; i++) {
			String staffName = myStaffFactory.getRandomName();
			String tasks = myStaffFactory.getRandomTasks();
			String[] nameParts = staffName.split(" ");
			Staff list = new Engineer(nameParts[0], nameParts[1], tasks, "", i, 0);
			staffList[i] = list;
		}
		//Nurse
		for (int i = 20; i < 30; i++) {
			String staffName = myStaffFactory.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new Nurse(nameParts[0], nameParts[1], "", "", i, 0);
			staffList[i] = list;
		}
		//Veterinarian
		for (int i = 30; i < 40; i++) {
			String staffName = myStaffFactory.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new Veterinarian(nameParts[0], nameParts[1], "", "", i, 0);
			staffList[i] = list;
		}
		//Trainee
		for (int i = 40; i < 50; i++) {
			String staffName = myStaffFactory.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new Trainee(nameParts[0], nameParts[1], "", "", i, 0);
			staffList[i] = list;
		}
		return staffList;
		
	}
	public void tasks() {
		for (Staff st : staffList) {

			if (st.getCategory().equals("Receptionist") || st.getCategory().equals("Engineer")) {
				System.out.println("Staff ID: " + st.getId() + "\n" + "Staff Name: " + st.getName() + " " + st.getSurname()
						+ " \n" + "Tasks: " + st.getTasks() + "\n" + "Staff Occupaton: " + st.getCategory() + "\n");
			}
		}
	}
	
	public void printStaff() {
		for (Staff st : staffList) {
			System.out.println("Staff ID: " + st.getId() + "\n" + "Staff Name: " + st.getName() + " " + st.getSurname()
					+ "\n" + "Staff Occupaton: " + st.getClass().getSimpleName() + "\n" + "Salary level: "
					+ st.getSalary() + "\n");
		}
	}
	//search By Category
	public void searchByCategory(String category) {
		for (Staff st : staffList) {
			if (st.getCategory().equalsIgnoreCase(category)) {
				System.out.println("Staff Name: " + st.getName() + " " + st.getSurname());
			}
		}
	}
	//search Staff by name
	public Staff searchStaff(String staffName) {
		for (Staff st : staffList) {
			if (st.getName().equalsIgnoreCase(staffName)) {
				return st;
			}
		}
		return null;
	}
	
	public Animals[] animalsList() {

		// Cat
		for (int i = 0; i < 200; i++) {

			String animalName = myAnimalFactory.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalFactory.getRandomMedicalCondition();
			int age = myAnimalFactory.getRandomAge();
			Animals animalList = new Cat(nameParts[0], "", medicalCondicion, age, i);
			animalsList[i] = animalList;
		}

		// Dog
		for (int i = 200; i < 400; i++) {
			String animalName = myAnimalFactory.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalFactory.getRandomMedicalCondition();
			int age = myAnimalFactory.getRandomAge();
			Animals animalList = new Dog(nameParts[0], "", medicalCondicion, age, i);
			animalsList[i] = animalList;
		}

		// Snake
		for (int i = 400; i < 600; i++) {
			String animalName = myAnimalFactory.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalFactory.getRandomMedicalCondition();
			int age = myAnimalFactory.getRandomAge();
			Animals animalList = new Snake(nameParts[0], "", medicalCondicion, age, i);
			animalsList[i] = animalList;
		}

		// Bird
		for (int i = 600; i < 800; i++) {
			String animalName = myAnimalFactory.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalFactory.getRandomMedicalCondition();
			int age = myAnimalFactory.getRandomAge();
			Animals animalList = new Bird(nameParts[0], "", medicalCondicion, age, i);
			animalsList[i] = animalList;
		}
		return animalsList;
	}
	
	public void printAnimals(Animals[] animalList) {

		for (Animals an : animalsList) {
			System.out.println("Animal ID: " + an.getAnimalId() + "\n" + "Animal Name: " + an.getAnimalName() + "\n"
					+ "Animal Type: " + an.getAnimalType() + "\n" + "Age: " + an.getAnimalAge()+ "\n" + "Medical Condition: "
					+ an.getMedicalCondition() + "\n");
		}
	}
	//search By Category
	public void searchByCategoryAnimal(String type) {

		for (Animals an : animalsList) {
			if (an.getAnimalType().equalsIgnoreCase(type)) {
				System.out.println("Animal ID: " + an.getAnimalId() + " - Animal Name: " + an.getAnimalName());
			}
		}
	}
	//search by name
	public Animals searchAnimal(String animalName) {
		for (Animals an : animalsList) {
			if (an.getAnimalName().equalsIgnoreCase(animalName)) {
				return an;
			}
		}
		return null;
	}

}
