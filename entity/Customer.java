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
  
  @Id @OneToOne
  private IDCard id;
  
  private String name;
  
  @OneToOne
  private Location location;
  private HashSet<String> phoneNumber;
  
  @Temporal(javax.persistence.TemporalType.DATE)
  private Date birthDate;
  
  @OneToMany
  private HashSet<Card> card;  
  
  @ManyToOne
  private Branch registrationBranch;
  
  @OneToMany
  private HashSet<Order> issuedOrder;
  
  public Customer() {
    phoneNumber = new HashSet<>();
    card = new HashSet<>();
    issuedOrder = new HashSet<>();
  }
  
  public Customer(IDCard id) {
    this.phoneNumber = new HashSet<>();
    card = new HashSet<>();
    issuedOrder = new HashSet<>();
    this.id = id;
  }
  
  public int getAge() {
    long ageMs = new Date().getTime()-birthDate.getTime();
    Date age = new Date(ageMs);
    return age.getYear();
  };
  
  public IDCard getIDCard() {
    return id;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setLocation(Location location) {
    this.location = location;
  }
  
  public Location setLocation() {
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
  
  public void setCard(HashSet<Card> card) {
    this.card = card;
  }
  
  public void addCard(Card card) {
    this.card.add(card);
  }
  public void delCard(Card card) {
    this.card.remove(card);
  }
  
  public HashSet<Card> getCard() {
    return card;
  }
  
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }
  
  public Date getBirthDate() {
    return birthDate;
  } 
  
  public void setBranch(Branch registrationBranch){
    this.registrationBranch = registrationBranch;
  }
  
  public Branch getBranch(){
    return registrationBranch;
  }
  
  public void setIssuedOrder(HashSet<Order> issuedOrder) {
    this.issuedOrder = issuedOrder;
  }
  
  public void addIssuedOrder(Order issuedOrder) {
    this.issuedOrder.add(issuedOrder);
  }
  public void delIssuedOrder(Order issuedOrder) {
    this.issuedOrder.remove(issuedOrder);
  }
  
  public HashSet<Order> getIssuedOrder() {
    return issuedOrder;
  }
}
