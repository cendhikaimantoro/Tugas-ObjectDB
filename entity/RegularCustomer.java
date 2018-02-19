/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author ASUS-A451LB
 */
@Entity
public class RegularCustomer extends Customer implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private int point;
  
  public RegularCustomer() {
    super();
    this.point = 0;
  }
  
  public RegularCustomer(IDCard id) {
    super(id);
    this.point = 0;
  }
  
  public void setPoint(int point) {
    this.point = point;
  }
  
  public int getPoint() {
    return point;
  }
}
