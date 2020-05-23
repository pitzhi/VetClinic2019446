package staff;

public class Engineer extends Staff {

	public Engineer(String name, String surname, String tasks, String category, double salary, int id) {
		super(name, surname, tasks, category, salary, id);
		// TODO Auto-generated constructor stub
		this.setSalary(2200);
		this.setCategory("Engineer");
	}
	
	

}
