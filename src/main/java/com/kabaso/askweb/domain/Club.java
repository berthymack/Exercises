/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kabaso.askweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hashcode
 */
@Entity
public class Club implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private Club(Builder builder) {
       id = builder.id;
       name= builder.name;
    }

    private Club() {
    }
    
    public static class Builder{
        private Long id;
        private String name;

        public Builder(String name) {
            this.name = name;
        }
        
        public Builder id(Long value){
            this. id = value;
            return this;
        }
        
        public Club build(){
            return new Club(this);
        }
        
    }

    public Long getId() {
        return id;
    }

  
    public String getName() {
        return name;
    }
  
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Club)) {
            return false;
        }
        Club other = (Club) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kabaso.askweb.domain.Club[ id=" + id + " ]";
    }
    
}
