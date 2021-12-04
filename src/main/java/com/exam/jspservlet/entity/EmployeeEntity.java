package com.exam.jspservlet.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name ="fullname")
    private String fullname;
    
    @Column(name ="bday")
    private String bday;
    
    @Column(name = "address")
    private String address;

    @Column(name ="position")
    private String position;
    
    @Column(name ="department")
    private String department;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String fullname, String bday, String address, String position, String department) {
        this.fullname = fullname;
        this.bday = bday;
        this.address = address;
        this.position = position;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
