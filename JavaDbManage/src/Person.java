import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private String subname;
	private int age;
	private List<Person> lista;

	public Person(String _name, String _subname, int _age) {
		this.name = _name;
		this.subname = _subname;
		this.age = _age;
		this.lista = new ArrayList<Person>();
	}
	
	
	public void addPerson(Person _person) {
		lista.add(_person);
	}
	
	public String toString() {
		String mensaje = "";
		
		for (int i = 0; i < lista.size(); i++) {
			mensaje +="Name = " + lista.get(i).getName() + "\n" +"SubName = " + lista.get(i).getSubname() + "\n"+ "Age = " + lista.get(i).getAge() + "\n\n";
		}
		
		return mensaje;
	}
	
	/**
	 * Method get for age
	 * 
	 * @return the age of the person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Method get for name
	 * 
	 * @return name of the person
	 */

	public String getName() {
		return name;
	}

	/**
	 * Method get for the sub name
	 * 
	 * @return the sub name of the person
	 */

	public String getSubname() {
		return subname;
	}

	/**
	 * Method set , this method change the age of the person
	 * 
	 * @param age the age o the new age u want to put in
	 */

	public void setAge(int age) {
		this.age = age;
	}

}
