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
public class Component implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id @GeneratedValue
  private long uid;
  
  private int quantityNeeded;
  
  @OneToOne
  private Good component;
  
  public Component() {
    
  }
  
  public void setComponent(Good component) {
    this.component = component;
  }
  
  public Good getComponent () {
    return component;
  }
  
  public void setQuantityNeeded(int quantityNeeded) {
    this.quantityNeeded = quantityNeeded;
  }
  
  public int getQuantityNeeded () {
    return quantityNeeded;
  }
  
}
