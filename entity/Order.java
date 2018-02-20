/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Richard
 */
@Entity
public class Order implements Serializable{
  private static final long serialVersionUID = 1L;
  
  public enum Type {
    cash,
    card;
  }
  
  @Id
  private String number;
  
  @Temporal(javax.persistence.TemporalType.DATE)
  private Date orderDate;
  private Type type;
  
  @ManyToOne
  private Card usedCard;
  
  @ManyToOne
  private Customer customer;
  
  @Id @ManyToOne
  private Branch orderPlace;
  
  //TODO attribute set<OrderQty> orderedGood; + SETTER + GETTER
  //private HashSet<OrderQty> orderedGood;

  @ManyToOne
  private Employee handler;
  
  public Order(){
    //this.orderedGood = new HashSet<>();
  }
  
  public Order(String number, Branch orderPlace){
    this.number = number;
    this.orderPlace = orderPlace;
    //this.orderedGood = new HashSet<>();
  }
  
  public String getNumber(){
    return number;
  }
  
  public void setOrderDate(Date orderDate){
    this.orderDate = orderDate;
  }
  
  public Date getOrderDate(){
    return orderDate;
  }
  
  public void setType(Type type){
    this.type = type;
  }
  
  public Type getType(){
    return type;
  }
  
  public void setUsedCard(Card usedCard){
    this.usedCard = usedCard;
  }
  
  public Card getUsedCard(){
    return usedCard;
  }
  
  public void setCustomer(Customer customer){
    this.customer = customer;
  }
  
  public Customer getCustomer(){
    return customer;
  }
  
  public Branch getBranch(){
    return orderPlace;
  }
  
  public void setHandler(Employee handler){
    this.handler = handler;
  }
  
  public Employee getHandler(){
    return handler;
  }
  
}
