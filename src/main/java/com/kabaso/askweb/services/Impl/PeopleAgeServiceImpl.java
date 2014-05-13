/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kabaso.askweb.services.Impl;

import com.kabaso.askweb.domain.Person;
import com.kabaso.askweb.respository.PersonRepository;
import com.kabaso.askweb.services.PeopleAgeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hashcode
 */
@Service
public class PeopleAgeServiceImpl implements PeopleAgeService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAgeAbove(int age) {
        List<Person> persons = new ArrayList<>();
        List<Person> allPersons = personRepository.findAll();

        for (Person person : allPersons) {
            if (person.getAge() > age) {
                persons.add(person);
            }
        }
        return persons;
    }

}
