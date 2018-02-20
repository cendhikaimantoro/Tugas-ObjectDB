/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Richard
 */
@Entity
public class Card implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public enum Type {
    credit,
    debit;
  }
  
  @Id
  private String number;
  
  private String bank;
  private Type type;
  
  @Temporal(javax.persistence.TemporalType.DATE)
  private Date lastTransactionDate;
  private int totalTransaction;
    
  @Temporal(javax.persistence.TemporalType.DATE)
  private Date expirationDate;
  
  @OneToMany(mappedBy="usedCard")
  private Set<Order> paidOrder;
    
  public Card(){
    this.paidOrder = new HashSet<>();
  }
  
  public Card(String number){
    this.number = number;
    this.paidOrder = new HashSet<>();
  }
  
  public String getNumber(){
    return number;
  }
  
  public void setBank(String bank){
    this.bank = bank;
  }
  
  public String getBank(){
    return bank;
  }
  
  public void setType(Type type){
    this.type = type;
  }
  
  public Type getType(){
    return type;
  }
  
  public void setLastTransactionDate(Date lastTransactionDate){
    this.lastTransactionDate = lastTransactionDate;
  }
  
  public Date getLastTransactionDate(){
    return lastTransactionDate;
  }
  
  public void setTotalTransaction(int totalTransaction){
    this.totalTransaction = totalTransaction;
  }
  
  public int getTotalTransaction(){
    return totalTransaction;
  }
  
  public void setExpirationDate(Date expirationDate){
    this.expirationDate = expirationDate;
  }
  
  public Date getExpirationDate(){
    return expirationDate;
  }
  
  public void setPaidOrder(HashSet<Order> paidOrder){
    this.paidOrder = paidOrder;
  }
  
  public void addPaidOrder(Order paidOrder){
    this.paidOrder.add(paidOrder);
  }
  public void delPaidOrder(Order paidOrder){
    this.paidOrder.remove(paidOrder);
  }
  
  public HashSet<Order> getPaidOrder(){
    return (HashSet) paidOrder;
  }
  
}