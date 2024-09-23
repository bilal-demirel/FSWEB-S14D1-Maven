package com.workintech.developers;

public class HRManager extends Employee{
    JuniorDeveloper[] juniorDeveloper;
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(Employee employee){

    }
}
