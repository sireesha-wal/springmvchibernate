package com.hellokoding.hello.dao;

import java.util.List;
import com.hellokoding.hello.entity.Person;
public interface IPersonDAO {
    List<Person> getAllPersons();
    Person getPersonById(int pid);
    void addPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(int pid);
    boolean personExists(String username);
} 