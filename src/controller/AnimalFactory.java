package controller;

import java.util.Random;

public class AnimalFactory {
	
	Random rd = new Random();
	//This is the list of possible animal names on the system.
	protected String[] nameAnimal = {"EGGNOG", "RUCKEE", "ISIS", "SHIPPO", "PANTHER", "TOWELIE", "AGATE", "COLT", "PERCY",
			"DUDE", "BLANKA", "SAMMY", "HADIES", "HALLE", "HOLLYWOOD", "PADDINGTON", "RIP", "CHAROLETTE", "TOBIA", "GROOT",
			"LESLIE", "BETHOVEN", "CLEOPATRA", "COCO", "SHURASTEI", "HALS", "JACK", "BANGUELA", "ANA BANANA", "LIA", "TOBY", "PAC-MAN", "NICK",
			"AMY-LEE", "BANGULEA II", "NAPHOLEON", "MAX", "KATTIE", "MR. FLUFFY", "SPARKY", "HACHIKO", "TECH", "RAMEN", "LANCE", "SPIKE", "MOCHA",
			"DUFF", "GUINNESS", "CATUABA", "PINGA", "VODKA", "GRUMPY", "SUPERSHOCK", "JAVA", "PYTHON", "SHEBA", "LEONARDO", "MICHELANGELO",
			"RAPHAEL", "DONATELLO", "FRESH PRINCE", "SAM", "SHADOW", "LUCY", "CAPTAIN", "KITTY", "SIMBA", "PRINCESS", "GINGER", "TIGER", "GORDINHA",
			"PUSHEEN", "HOLY", "LUCKY", "SOPHIE", "CHARLIE", "CLEO", "MILO", "OZZIE", "DARTH", "VADER", "JEDI", "YODA",
			"LUKE", "PRINCESS LEIA", "FRODO", "GANFALF", "SAURON", "MARTY MCFLY", "ANAKIN", "APOLLO", "CONOR", "DUKE", "ET", "SYLVESTER", 
			"SPEEDY GONZALES", "BUGS BUNNY", "DAFFY DUCK", "TWEETY", "BUDDY", "BEANS", "CECIL", "MICKEY", "RICO", "AMARELO", "SNOWBALL", "BELLA",
			"LOLA", "MONICA", "CHANDLER", "RACHEL", "ROSS", "PHOEBE", "JOEY", "ANGEL", "WHISKERS", "MOLLY", "SAMMY", "HARRY", "LILY", 
			"MOLY", "ZOE", "JPG", "CINNAMON", "BUNNY", "BABY", "WINONA", "KURT", "JOHNNY", "COURTNEY", "JIMMY", "FREDDIE",
			"SLASH", "SANTA'S LITTLE HELPER", "ALF", "ELMO", "COOKIE MONSTER", "PORKCHOP", "DOUG", "SKEETER", "BEETLEJUICE", "ROSITA", "BEYONCE", "JAY-Z"
			};
	//This is the list of possible age on the system.
	protected int[] age = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	//This is the list of medical condition on the system.
	protected String[] medicalCondition = {"Pregnancy", "Ringworm", "Arthritis", "Deafness", "Cancer", "Diabetes", "Heartworm", "Kennel Cough", "Rabies", "Parvovirus",
			"Ringworm", "Allergies", "Arthritis", "Bronchitis", "Influenza Virus", "Diarrhea", "Enteritis",
			"Depression", "Demodectic Mange", "Dental Disease", "Fecal impaction", "Flea Allergy",
			"Folliculitis", "Foreign Body (Intestinal)", "Glaucoma", "Incontinence (Urinary)", "Obesity",
			"Osteoarthritis", "Candida", "Polyomavirus", "Psittacosis", "Leukemia Virus",
			"High-Rise Syndrome", "Upper Respiratory Infections", "Bladder Infection", "Constipation", "Ear Mites",
			"Epiphora", "Eye Infections", "Eyelid Conditions", "Eyes Retinal Diseases", "Kidney Disease",
			"Kidney Failure", "Mange", "Mast Cell Tumors", "Pancreatitis", "Worms", };
	//This will build an animal with a random type.
	public String getRandomAnimal() {
		String aname = nameAnimal[rd.nextInt(nameAnimal.length)];		
		return (aname);
	}
	//Random MedicalCondition
	public String getRandomMedicalCondition() {
		String medicalcon = medicalCondition[rd.nextInt(medicalCondition.length)];
		return (medicalcon);
	}
	//Random Age
	public int getRandomAge() {
		int ageAnimal = age[rd.nextInt(age.length)];
		return (ageAnimal);
	}
	

}
