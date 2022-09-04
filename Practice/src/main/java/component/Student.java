package component;

import javax.persistence.*;

@Entity
@NamedQueries({
	@NamedQuery(name = "Student.getAll", query = "select * from student")
})
public class Student {
	
	@Id
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public Student() {
	
	}
	
	public Student(int id, String name, String address, int marks) {
		this.roll = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	public int getId() {
		return roll;
	}
	
	public void setId(int id) {
		this.roll = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [Id=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}	
	
}
