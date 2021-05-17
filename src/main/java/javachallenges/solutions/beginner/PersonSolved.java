package javachallenges.solutions.beginner;

public class PersonSolved {

	private String firstName;
	private String lastName;
	private int age;
	
	public PersonSolved() {};
	
	public PersonSolved(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
    public void introduceYourself() {
        System.out.println("Hi, my name is " +
                firstName + " " + lastName +
                " and I'm " + age);
    }

}
