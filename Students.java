/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BerthyMack
 */
import java.util.*;

public class Students {
    
    String name = "";
    String surname = "";
    String studNum = "";
    String telNo = "";
    public Students(String name,String studNum,String telNo)
    {
       this.name = name;
       this.studNum = studNum;
       this.telNo = telNo;
    }
    
     public Students(String name,String surname,String studNum,String telNo)
    {
       this.name = name;
       this.studNum = studNum;
       this.telNo = telNo;
       this.surname = surname;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setStudNum(String studNum)
    {
        this.studNum = studNum;
    }
    public String getStudNum()
    {
        return studNum;
    }
    
    public void setTelNo(String telNo)
    {
        this.telNo = telNo;
    }
    public String getTelNo()
    {
        return telNo;
    }
    
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }
    public String toString()
    {
        return name+" "+surname+" "+studNum+" "+telNo;
    }
    public boolean equals(Object obj)
    {
        return toString().equals(((Students)obj).toString()); 
    }
    public int hashCode()
    {
        int hash = toString().hashCode();
        return hash;
    }
    
}
