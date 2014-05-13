/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kabaso.askweb.respository;

import com.kabaso.askweb.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author boniface
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
