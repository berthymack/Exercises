/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kabaso.askweb.respository;

import com.kabaso.askweb.domain.Person;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hashcode
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
