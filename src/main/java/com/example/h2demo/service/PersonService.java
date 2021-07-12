package com.example.h2demo.service;

import com.example.h2demo.model.Person;
import com.example.h2demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {


    @Autowired
    PersonRepository personRepo;

    public List<Person> getAllPerson()
    {
        List<Person> personList = new ArrayList<Person>();
        personRepo.findAll().forEach(person -> personList.add(person));
        return personList;
    }
    //getting a specific record
    public Person getPerosnById(int id)
    {
        return personRepo.findById(id).get();
    }
    public void saveOrUpdate(Person person)
    {
        personRepo.save(person);
    }
    //deleting a specific record
    public void deletePerson(int id)
    {
        personRepo.deleteById(id);

    }


}
