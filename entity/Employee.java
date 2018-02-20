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
  
  @ManyToOne
  private Branch workplace;
  
  @OneToMany(mappedBy="handler")
  private HashSet<Order> handledOrder;
  
  @OneToMany(mappedBy="consultant")
  private HashSet<ExecutiveCustomer> consultedCustomer;
  
  public Employee(){
    this.phoneNumber = new HashSet<>();
    this.handledOrder = new HashSet<>();
    this.consultedCustomer = new HashSet<>();
  }
  
  public Employee(String id){
    this.phoneNumber = new HashSet<>();
    this.id = id;
    this.handledOrder = new HashSet<>();
    this.consultedCustomer = new HashSet<>();
  }
  
  public String getID(){
    return id;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
  
  public void setLocation(Location location){
    this.location = location;
  }
  
  public Location getLocation(){
    return location;
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
  
  public HashSet<String> getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setStartingDate(Date startingDate){
    this.startingDate = startingDate;
  }
  
  public Date getStartingDate(){
    return startingDate;
  }
  
  public void setBaseSalary(int baseSalary){
    this.baseSalary = baseSalary;
  }
  
  public int getBaseSalary(){
    return baseSalary;
  }
  
  public void setBirthDate(Date birthDate){
    this.birthDate = birthDate;
  }
  
  public Date getBirthDate(){
    return birthDate;
  }
  
  public void setBranch(Branch workplace){
    this.workplace = workplace;
  }
    
  public Branch getBranch(){
    return workplace;
  }
  
  public void setHandledOrder(HashSet<Order> handledOrder){
    this.handledOrder = handledOrder;
  }
  
  public void addHandledOrder(Order handledOrder){
    this.handledOrder.add(handledOrder);
  }
  public void delHandledOrder(Order handledOrder){
    this.handledOrder.remove(handledOrder);
  }
  
  public HashSet<Order> getHandledOrder(){
    return handledOrder;
  }
  
  public void setConsultedCustomer(HashSet<ExecutiveCustomer> consultedCustomer){
    this.consultedCustomer = consultedCustomer;
  }
  
  public void addConsultedCustomer(ExecutiveCustomer consultedCustomer){
    this.consultedCustomer.add(consultedCustomer);
  }
  
  public void delConsultedCustomer(ExecutiveCustomer consultedCustomer){
    this.consultedCustomer.remove(consultedCustomer);
  }
  
  public HashSet<ExecutiveCustomer> getConsultedCustomer(){
    return consultedCustomer;
  }
        
}