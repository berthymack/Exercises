/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kabaso.askweb.test.services;

import com.kabaso.askweb.app.conf.ConnectionConfig;
import com.kabaso.askweb.domain.Person;
import com.kabaso.askweb.respository.PersonRepository;
import com.kabaso.askweb.services.PeopleAgeService;
import static com.kabaso.askweb.test.services.TotalNumberTest.ctx;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author hashcode
 */
public class PeopleAgeServiceTest {

    private static ApplicationContext ctx;
    private PeopleAgeService peopleAgeService;
    private PersonRepository personRepository;

    public PeopleAgeServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getAgeofPeple() {
        personRepository = ctx.getBean(PersonRepository.class);
        peopleAgeService = ctx.getBean(PeopleAgeService.class);
        
        Person p1 = new Person.Builder("b@k.com")
                .age(5).build();
        Person p2 = new Person.Builder("b1@k.com")
                .age(12).build();
        Person p3 = new Person.Builder("b2@k.com")
                .age(16).build();

        personRepository.save(p1);
        personRepository.save(p2);
        personRepository.save(p3);

        List<Person> people = peopleAgeService.getAgeAbove(4);

        Assert.assertEquals(people.size(), 3);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
       personRepository = ctx.getBean(PersonRepository.class);
       personRepository.deleteAll();
    }
}
