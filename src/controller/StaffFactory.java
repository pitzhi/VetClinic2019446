package controller;

import java.util.Random;

public class StaffFactory {
	
	Random rd = new Random();
	//This is the list of possible names on the system.
	protected String[] name = { "Adao", "Draco", "Harry", "Hermione", "Jack", "Emily", "James", "Ava", "Daniel",
			"Emma", "Conor", "Sophie", "Seán", "Amelia", "Adam", "Ella", "Noah", "Michael", "Grace", "Charlie", "Mia",
			"Luke", "Jack", "Emily", "James", "Grace", "Daniel", "Hannah", "Brian", "Alberto", "Manuela", "Eduarda",
			"Nisleine", "Maria", "Guardalupe","Suely", "Eva", "Eliane", "Elizangela", "Leilla", "Walquiria", "Waldirene",
			"Wagner", "Terezinha", "Raoni", "Liana", "Guilherme", "Erick", "Willian", "Lanara", "Amilcar", "Edna",
			"Ilda", "Debora", "Lily", "Lilian", "Bruna", "Alysson", "Roberta", "Leticia", };
	//This is the list of possible surnames on the system.
	protected String[] surname = { "Lourenco", "Carvalho", "Peres", "Silva", "Santos", "Almeida", "Murphy", "O'Kelly",
			"O'Sullivan", "Walsh", "Smith", "O'Brien", "O'Byrne", "O'Ryan", "O'Connor", "O'Neill", "O'Reilly", "Doyle",
			"McCarthy", "O'Gallagher", "O'Doherty", "Kennedy", "Lynch", "Murray", "O'Quinn", "O'Moore", "Leite",
			"Camilo", "Pinto", "Potter", "Granger", "Carvalho", "Gonzalves", "Viera", "Marinha", "Fontes", "White",
			"Malfoy" };
	//This is the list of possible task on the system.
	protected String[] tasks = { "Filing", "Making Phone Calls", "On Holidays", "Make an appointment", "Answer phone",
			"Staff support", "Generate invoices for payment", "Bank reconciliation", "Buy office supplies",
			"Generate payroll" };
	
	public StaffFactory() {
		
	}
	//This will build a staff with a random name.
	public String getRandomName() {
		String fname = name[rd.nextInt(name.length)];
		String sname = surname[rd.nextInt(surname.length)];
		return (fname + " " + sname);
	}
	//RandomTasks
	public String getRandomTasks() {
		String task = tasks[rd.nextInt(tasks.length)];
		return (task);
	}
	
	@Override
	public String toString() {
		
		return this.name + " " + this.surname;
	}

}
