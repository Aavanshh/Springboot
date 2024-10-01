package com.springcore1.collections;
import java.util.*;
public class Emp {
	private String name;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties dop ; 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public Properties getDop() {
		return dop;
	}
	public void setDop(Properties dop) {
		this.dop = dop;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phone, Set<String> address, Map<String, String> courses, Properties dop) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
		this.dop = dop;
	}
	
	
	
	
}
