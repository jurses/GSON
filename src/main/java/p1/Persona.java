package p1;

public class Persona {
	private String name;
	private String surname;
	private int age;
	
	Persona ()
	{
		name = "";
		surname = "";
		age = 0;
	}
	
	public void setInfo(String name, String surname, int age)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
}
