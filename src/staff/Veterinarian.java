package staff;

public class Veterinarian extends Staff {

	public Veterinarian(String name, String surname, String tasks, String category, double salary, int id) {
		super(name, surname, tasks, category, salary, id);
		// TODO Auto-generated constructor stub
		this.setSalary(3300);
		this.setCategory("Veterinarian");
		
	}
	

}
