package bean;

public class Mother {
	
	private String name;
	private String surname;
	private String maiden_name;
	private int age;
	
	public Mother() {}
	

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

	public String getMaiden_name() {
		return maiden_name;
	}

	public void setMaiden_name(String maiden_name) {
		this.maiden_name = maiden_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Mother [name=" + name + ", surname=" + surname
				+ ", maiden_name=" + maiden_name + ", age=" + age + "]";
	}
	
}
