/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author ASUS-A451LB
 */
@Entity
public class OrderQty implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id @GeneratedValue
  private long uid;
  
  @ManyToOne
  private Good orderedGood;
  private int quantity;
  
  
  
  public OrderQty() {
    
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  public int getQuantity () {
    return quantity;
  }
  
  public void setOrderedGood(Good orderedGood) {
    this.orderedGood = orderedGood;
  }
  
  public Good getOrderedGood () {
    return orderedGood;
  }
  
}
