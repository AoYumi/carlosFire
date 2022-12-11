package com.example.firebase;

public class Employee {

    private String id;
    private String empname;
    //const
    public Employee(){
    }
    //getter setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    //parameterized constructor
    public Employee(String id, String empname) {
        this.id = id;
        this.empname = empname;
    }

}
