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
 * @author Richard
 */
@Entity
public class HQ extends Branch implements Serializable{
  private static final long serialVersionUID = 1L;
  
  public HQ(){
    super();
  }
  
  public HQ(String id){
    super(id);
  }
}
