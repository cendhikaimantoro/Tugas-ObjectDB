/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Richard
 */
@Entity
public class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    
    private String name;
    
    @OneToOne
    private Location location;
    private HashSet<String> phoneNumber;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startingDate;
    private int baseSalary;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;
    
    public int getAge() {
        long ageMs = new Date().getTime()-birthDate.getTime();
        Date age = new Date(ageMs);
        return age.getYear();
    };

    public Employee(){
        
    }
    
    public Employee(String id){
        this.phoneNumber = new HashSet<>();
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public Location getLocation(){
        return location;
    }
    
    public HashSet<String> getPhoneNumber() {
        return phoneNumber;
    }
    
    public Date getStartingDate(){
        return startingDate;
    }
    
    public int getBaseSalary(){
        return baseSalary;
    }
    
    public Date getBirthDate(){
        return birthDate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLocation(Location location){
        this.location = location;
    }
    
    public void setPhoneNumber(HashSet<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
  
    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumber.add(phoneNumber);
    }
    public void delPhoneNumber(String phoneNumber) {
        this.phoneNumber.remove(phoneNumber);
    }
    
    public void setStartingDate(Date startingDate){
        this.startingDate = startingDate;
    }
    
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
        
}
