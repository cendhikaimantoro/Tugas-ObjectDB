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
public class Location implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id @GeneratedValue
  private long uid;
  
  private String address;
  private String city;
  private String province;
  private String postcode;
  
  public Location() {
    
  }
  
  public Location(String address, String city, String province, String postcode) {
    this.address = address;
    this.city = city;
    this.province = province;
    this.postcode = postcode;
  }
  
  void setAddress(String address) {
    this.address = address;
  }
  
  void setCity(String city) {
    this.city = city;
  }
  
  void setProvince(String province) {
    this.province = province;
  }
  
  void setPostcode(String postcode) {
    this.postcode = postcode;
  }
  
  String getAddress() {
    return address;
  }
  
  String getCity() {
    return city;
  }
  
  String getProvince() {
    return province;
  }
  
  String getPostcode() {
    return postcode;
  }
}
