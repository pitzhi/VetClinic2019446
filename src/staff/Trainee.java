package staff;

public class Trainee extends Staff {

	public Trainee(String name, String surname, String tasks, String category, double salary, int id) {
		super(name, surname, tasks, category, salary, id);
		// TODO Auto-generated constructor stub
		this.setSalary(1500);
		this.setCategory("Trainee");
	}
	

}
