package staff;

public abstract class Staff {
	private String name;
	private String surname;
	private String tasks;
	private String category;
	private double salary;
	private int Id;
	//constructor
	public Staff(String name, String surname, String tasks, String category, double salary, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.tasks = tasks;
		this.category = category;
		this.salary = salary;
		Id = id;
	}

	public Staff() {
		super();
	}
	//get & set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTasks() {
		return tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	
	
	
	

}
