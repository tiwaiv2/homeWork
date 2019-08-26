package jdk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Person{
	
	private String firstName;
	private String lastName;
    private int age;
    private int  salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Person(String firstName, String lastName, int age, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + salary;
		
		System.out.println(result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
    
    
    
    
}
public class Jdk8ComparatorExample {

	
	public static void main(String[] args) {
		
		List l1= new ArrayList();
		
		l1.add(new Person("asvivek","tiwari",24,12345));
		l1.add(new Person("vicdvek","tiwari",25,12342122));
		l1.add(new Person("vicdcvek","tiwari",26,1235674));
		l1.add(new Person("vivek","tiwari",23,1234));
		l1.add(new Person("vifefvek","tiwari",27,1234876));
		l1.add(new Person("vi3rervek","tiwari",28,12345654));
		
	
		System.out.println(l1);
		l1.sort(Comparator.comparing(Person::getAge));
		System.out.println(l1);
		
		
		Set s1= new HashSet();
		s1.add(new Person("asvivek","tiwari",24,12345));
		s1.add(new Person("asvivek","tiwari",24,12345));
		
		System.out.println(s1.size());
		
		
	}
}
