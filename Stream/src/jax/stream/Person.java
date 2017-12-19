package jax.stream;

public class Person {
	public static enum Gender{
		MAN,WOMAN
	}
	
	private String name;
	
	private Gender gender;
	
	private int age;
	
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Person(String name, Gender gender, int age, int height) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + "]";
	}
	
}
