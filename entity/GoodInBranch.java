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
public class GoodInBranch implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id @GeneratedValue
  private long uid;
  
  private int goodQuantity;
  
  @ManyToOne
  private Good storedGood;
  
  //@ManyToOne
  //private NonHQ storingPlace;
  
  public GoodInBranch() {
    
  }
  
  public void setGoodQuantity(int goodQuantity) {
    this.goodQuantity = goodQuantity;
  }
  
  public int getGoodQuantity () {
    return goodQuantity;
  }
  
  public void setStoredGood(Good storedGood) {
    this.storedGood = storedGood;
  }
  
  public Good getStoredGood () {
    return storedGood;
  }
  
  //public void setStoringPlace(NonHQ storingPlace) {
  //  this.storingPlace = storingPlace;
  //}
  
  //public NonHQ getStoringPlace () {
  //  return storingPlace;
  //}
  
}
