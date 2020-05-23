package animal;

public abstract class Animals {
	private String AnimalName;
	private String medicalCondition;
	private String AnimalType;
	private int AnimalAge;
	private int AnimalId;
	//get & set
	public String getAnimalName() {
		return AnimalName;
	}
	public void setAnimalName(String animalName) {
		AnimalName = animalName;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	public String getAnimalType() {
		return AnimalType;
	}
	public void setAnimalType(String animalType) {
		AnimalType = animalType;
	}
	public int getAnimalAge() {
		return AnimalAge;
	}
	public void setAnimalAge(int animalAge) {
		AnimalAge = animalAge;
	}
	public int getAnimalId() {
		return AnimalId;
	}
	public void setAnimalId(int animalId) {
		AnimalId = animalId;
	}
	//constructor
	public Animals(String animalName, String medicalCondition, String animalType, int animalAge, int animalId) {
		super();
		this.AnimalName = animalName;
		this.medicalCondition = medicalCondition;
		this.AnimalType = animalType;
		this.AnimalAge = animalAge;
		AnimalId = animalId;
	}
	public Animals() {
		super();
	}
	
	
	

}
