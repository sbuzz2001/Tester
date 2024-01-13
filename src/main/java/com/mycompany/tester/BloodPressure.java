/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tester;

/**
 *
 * @author sbuzz
 */
public class BloodPressure {

	int id;
	String name;
	int yob;
	int systolic;
	int diastolic;
	
	public BloodPressure() {
		super();
	}
	public BloodPressure(int id, String name, int yob, int systolic, int diastolic) {
		super();
		this.id = id;
		this.name = name;
		this.yob = yob;
		this.systolic = systolic;
		this.diastolic = diastolic;
	}
	public void display() {
		System.out.println("User ID:" + getId());
		System.out.println("User Name:" + getName());
		System.out.println("Birth Year:" + getYob());
		System.out.println("Blood Pressure:" + getSystolic() + "/" + getDiastolic());
		System.out.println("");
	}
	public void calculate() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public int getSystolic() {
		return systolic;
	}
	public void setSystolic(int systolic) {
		this.systolic = systolic;
	}
	public int getDiastolic() {
		return diastolic;
	}
	public void setDiastolic(int diastolic) {
		this.diastolic = diastolic;
	}
}
