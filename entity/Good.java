/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


/**
 *
 * @author ASUS-A451LB
 */
@Entity
public class Good implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id
  private String id;
  private String description;
  private String color;
  private String size;
  private String type;
  private int quantity;
  
  
  @OneToMany(mappedBy="storedGood")
  private Set<GoodInBranch> storingPlace;
  
  public Good() {
    storingPlace = new HashSet<>();
  }
  
  public Good(String id) {
    this.id = id;
    storingPlace = new HashSet<>();
  }  
  
  public String getId() {
    return id;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getDescription () {
    return description;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public String getColor () {
    return color;
  }
  
  public void setSize(String size) {
    this.size = size;
  }
  
  public String getSize () {
    return size;
  }
  
  public void setType(String type) {
    this.type = type;
  }
  
  public String getType () {
    return type;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  public int getQuantity () {
    return quantity;
  }
  
  public void setStoringPlace(HashSet<GoodInBranch> storingPlace) {
    this.storingPlace = storingPlace;
  }
  
  public void addStoringPlace(GoodInBranch storingPlace) {
    this.storingPlace.add(storingPlace);
  }
  
  public void delStoringPlace(GoodInBranch storingPlace) {
    this.storingPlace.remove(storingPlace);
  }
  
  public HashSet<GoodInBranch> getStoringPlace() {
    return (HashSet) storingPlace;
  }
}
