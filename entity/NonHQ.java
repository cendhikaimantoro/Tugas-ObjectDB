/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.HashSet;
import javax.persistence.*;

/**
 *
 * @author Richard
 */
@Entity
public class NonHQ extends Branch implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @OneToMany(mappedBy="storingPlace")
  private HashSet<GoodInBranch> storedGood;
  
  public NonHQ(){
    super();
    this.storedGood = new HashSet<>();
  }
  
  public NonHQ(String id){
    super(id);
    this.storedGood = new HashSet<>();
  }
  
  public void setStoredGood(HashSet<GoodInBranch> storedGood){
    this.storedGood = storedGood;
  }
  
  public void addStoredGood(GoodInBranch storedGood){
    this.storedGood.add(storedGood);
  }
  public void delStoredGood(GoodInBranch storedGood){
    this.storedGood.remove(storedGood);
  }
  
  public HashSet<GoodInBranch> getStoredGood(){
    return storedGood;
  }
}
