/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author ASUS-A451LB
 */
@Entity
public class ExecutiveCustomer extends Customer implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private float discount;
  
  @ManyToOne
  private Employee consultant;
  
  public ExecutiveCustomer() {
    super();
    this.discount = 0;
  }
  
  public ExecutiveCustomer(IDCard id) {
    super(id);
    this.discount = 0;
  }
  
  public void setDiscount(float discount) {
    this.discount = discount;
  }
  
  public float getDiscount() {
    return this.discount;
  }
  
  public void setConsultant(Employee consultant) {
    this.consultant = consultant;
  }
  
  public Employee getConsultant() {
    return this.consultant;
  }
 
}
