/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kabaso.askweb.test.respository;

import com.kabaso.askweb.app.conf.ConnectionConfig;
import com.kabaso.askweb.domain.Person;
import com.kabaso.askweb.respository.PersonRepository;
import static java.lang.Compiler.enable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author boniface
 */

public class PersonRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;

    private PersonRepository repo;
    
    public PersonRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createPerson() {
         repo = ctx.getBean(PersonRepository.class);
         Person p = new Person.Builder("berthyM@cput.ac.za")
                 .firstname("B")
                 .lastnaname("K")
                 .build();
         repo.save(p);
         id = p.getId();
         Assert.assertNotNull(p);
         
     
     }
     
     @Test(dependsOnMethods = "createPerson", enabled = true)
     public void readPerson(){
         repo = ctx.getBean(PersonRepository.class);
         Person person = repo.findOne(id);
         Assert.assertEquals(person.getFirstname(), "B");
         
     }
     
    @Test(dependsOnMethods = "readPerson", enabled = true)
     private void updatePerson(){
         repo = ctx.getBean(PersonRepository.class);
         Person person = repo.findOne(id);
         Person updatedPerson = new Person.Builder("berthyM@cput.ac.za")
                 .person(person)
                 .firstname("Boniface")
                 .build();
        
         repo.save(updatedPerson);
         
         Person newPerson = repo.findOne(id);
         Assert.assertEquals(newPerson.getFirstname(), "Boniface");
         
     }
     
     @Test(dependsOnMethods = "updatePerson", enabled = true)
     private void deletePerson(){
         repo = ctx.getBean(PersonRepository.class);
         Person person = repo.findOne(id);
         repo.delete(person);
         
         Person deletedPerson = repo.findOne(id);
         
         Assert.assertNull(deletedPerson);
         
         
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
    }
}
