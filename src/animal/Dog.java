package animal;

public class Dog extends Animals {

	public Dog(String animalName, String medicalCondition, String animalType, int animalAge, int animalId) {
		super(animalName, medicalCondition, animalType, animalAge, animalId);
		// TODO Auto-generated constructor stub
		this.setAnimalType("Dog");
	}
	

}
