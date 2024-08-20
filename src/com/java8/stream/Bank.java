package com.java8.stream;

public class Bank {
	private String name;
	private Integer saving;

	public Bank(String name, Integer saving) {
		super();
		this.name = name;
		this.saving = saving;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSaving() {
		return saving;
	}
	public void setSaving(Integer saving) {
		this.saving = saving;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", saving=" + saving + "]";
	}
	
	

}
