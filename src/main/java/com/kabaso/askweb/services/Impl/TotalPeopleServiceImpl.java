/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kabaso.askweb.services.Impl;

import com.kabaso.askweb.domain.Person;
import com.kabaso.askweb.respository.PersonRepository;
import com.kabaso.askweb.services.TotalPeopleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hashcode
 */
@Service
public class TotalPeopleServiceImpl implements TotalPeopleService{
    @Autowired
    private PersonRepository personRepository;
    

    @Override
    public List<Person> getTotalPeople() {
        return personRepository.findAll();
        }
    
}
