package app;

/* The Person class represents an individual with various attributes and methods to access 
 * and modify those attributes */
public class Person {
	
	/* State variables*/
	private String name;
	private int age;
	private String gender;
	private String occupation;
	
	
	public Person(String name, int age, String gender, String occupation) {
		
		/* Non-default constructors that initialize the Person state variables*/
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
	}
	
	
   /* Getter and setter methods for each state variable */
	
	
	/* Retrieves the name of the Person */
	public String getName() {
		System.out.println("Getting Name: " + name);
		return name;
	}


	/* Sets the name of the Person */
	public void setName(String name) {
		System.out.println("Setting Name to: " + name);
		this.name = name;
	}


	/* Retrieves the age of the Person */
	public int getAge() {
		System.out.println("Getting Age: " + age);
		return age;
	}


	/* Sets the age of the Person */
	public void setAge(int age) {
		System.out.println("Setting Age to: " + age);
		this.age = age;
	}


	/* Retrieves the gender of the Person */
	public String getGender() {
		System.out.println("Getting Gender: " + gender);
		return gender;
	}


	/* Sets the gender of the Person */
	public void setGender(String gender) {
		System.out.println("Setting Gender to: " + gender);
		this.gender = gender;
	}


	/* Retrieves the occupation of the Person */
	public String getOccupation() {
		System.out.println("Getting Occupation: " + occupation);
		return occupation;
	}


	/* Sets the occupation of the Person */
	public void setOccupation(String occupation) {
		System.out.println("Setting Occupation to: " + occupation);
		this.occupation = occupation;
	}


	/* Main method for testing the Person class */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Jane Doe", 34, "female", "nurse");
		System.out.println("My name is " + person.name + ". " + "I am " + person.getAge() + " years old. "
				+ "I am a " + person.getGender() + ". " + "I work as a " + person.getOccupation() + ".");
	}

}
