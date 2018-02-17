/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import javax.persistence.*;


/**
 *
 * @author ASUS-A451LB
 */
@Entity
public class Customer implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id @GeneratedValue
  private long uid;
  
  @OneToOne
  private IDCard id;
  
  private String name;
  
  @OneToOne
  private Location location;
  private HashSet<String> phoneNumber;
  
  @Temporal(javax.persistence.TemporalType.DATE)
  private Date birthDate;
  
  //TODO attribute set<Card> Card; + SETTER + GETTER
  //private Set<Card> card;  
  
  //TODO relationship Branch registrationBranch inverse Branch::registeredCustomer; + SETTER + GETTER
  //private Branch registrationBranch;
  
  //TODO relationship set<Order> issuedOrder inverse Order::customer; + SETTER + GETTER
  //private Set<Order> issuedOrder;
  
  public Customer() {
    phoneNumber = new HashSet<>();
  }
  public int getAge() {
    long ageMs = new Date().getTime()-birthDate.getTime();
    Date age = new Date(ageMs);
    return age.getYear();
  };
  
  public void setIDCard(IDCard id) {
    this.id = id;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setLocation(Location location) {
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
  
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }
  
  public IDCard getIDCard() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public Location setLocation() {
    return location;
  }
  
  public HashSet<String> getPhoneNumber() {
    return phoneNumber;
  }
  
  public Date getBirthDate() {
    return birthDate;
  }
  
  
  
  
}
