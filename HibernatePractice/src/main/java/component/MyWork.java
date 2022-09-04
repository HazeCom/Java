package component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyWork {
	@Id
	private int empId;
	private String name;
	private String address;
	
	public MyWork() {
	
	}
	public MyWork(int empId, String name, String address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	@Override
	public String toString() {
		return "MyWork [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
}
