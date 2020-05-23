package staff;

public class Nurse extends Staff {

	public Nurse(String name, String surname, String tasks, String occupation, double salary, int id) {
		super(name, surname, tasks, occupation, salary, id);
		// TODO Auto-generated constructor stub
		
		this.setSalary(2300);
		this.setCategory("Nurse");
	}
	

}
