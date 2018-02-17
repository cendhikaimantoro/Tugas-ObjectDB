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
public class IDCard implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id @GeneratedValue
  private long uid;
  
  private String number;
  private String type;
  
  public IDCard() {
    
  }
  
  public IDCard(String number, String type) {
    this.number = number;
    this.type = type;
  }
  
  void setNumber(String number) {
    this.number = number;
  }
  
  void setType(String type) {
    this.type= type;
  }
  
  String getNumber() {
    return number;
  }
  
  String getType() {
    return type;
  }
  
}
