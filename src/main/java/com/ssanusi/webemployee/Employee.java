package com.ssanusi.webemployee;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String firstName;
    private String lastName;
    private double salary;
    private boolean has401K;
    private int companyID;
    private int healthPlanID;

    public Employee(String firstName, String lastName, double salary, boolean has401K, int companyID, int healthPlanID) {
        this.id = counter.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
        this.has401K = has401K;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
        this.salary = salary;
    }

    public Employee(Employee toClone) {
        this.id = toClone.getId();
        this.firstName = toClone.getFirstName();
        this.lastName = toClone.getLastName();
        this.has401K = toClone.isHas401K();
        this.companyID = toClone.getCompanyID();
        this.healthPlanID = toClone.getHealthPlanID();
        this.salary = toClone.getSalary();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public boolean isHas401K() {
        return has401K;
    }

    public void setHas401K(boolean has401K) {
        this.has401K = has401K;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getHealthPlanID() {
        return healthPlanID;
    }

    public void setHealthPlanID(int healthPlanID) {
        this.healthPlanID = healthPlanID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", has401K=" + has401K +
                ", companyID=" + companyID +
                ", healthPlanID=" + healthPlanID +
                '}';
    }
}
