package staff;

public class Receptionist extends Staff {

	public Receptionist(String name, String surname, String tasks, String category, double salary, int id) {
		super(name, surname, tasks, category, salary, id);
		// TODO Auto-generated constructor stub
		this.setSalary(1800);
		this.setCategory("Receptionist");
	}
	

}
