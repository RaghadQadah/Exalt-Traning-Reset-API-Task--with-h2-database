package com.example.h2demo.model;

import javax.persistence.*;
import java.util.List;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Person {
    //mark id as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //defining id as column name
    @Column
    private int id;
    //defining name as column name
    @Column
    private String name;
    //defining name as column name
    @Column
    private int age;
    //defining name as column name
    @Column
    private String jobs;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }


}
