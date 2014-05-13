/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kabaso.askweb.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author hashcode
 */
@Embeddable
public class Contact implements Serializable{
    private String landline;
    private String address;
    private String cell;

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
    
    
    
}
