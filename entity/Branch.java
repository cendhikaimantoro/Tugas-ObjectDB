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
public class Branch implements Serializable{
  private static final long serialVersionUID = 1L;
  
  @Id
  private String id;
  
  private String name;
  
  @OneToOne
  private Location location;
  private int area;
  
  @OneToMany(mappedBy="registrationBranch")
  private HashSet<Customer> customer;
  
  @OneToMany(mappedBy="orderPlace")
  private HashSet<Order> placedOrder;
  
  @OneToMany(mappedBy="workplace")
  private HashSet<Employee> worker;
  
  public Branch(){
    this.customer = new HashSet<>();
    this.worker = new HashSet<>();
  }
  
  public Branch(String id){
    this.id = id;
    this.customer = new HashSet<>();
    this.worker = new HashSet<>();
  }
  
  public String getID(){
    return id;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
  
  public void setLocation(Location location){
    this.location = location;
  }
  
  public Location getLocation(){
    return location;
  }
  
  public void setArea(int area){
    this.area = area;
  }
  
  public int getArea(){
    return area;
  }
  
  public void setCustomer(HashSet<Customer> customer){
    this.customer = customer;
  }
  
  public void addCustomeer(Customer customer){
    this.customer.add(customer);
  }
  public void delCustomer(Customer customer){
    this.customer.add(customer);
  }
  
  public HashSet<Customer> getCustomer(){
    return customer;
  }
  
  public void setPlacedOrder(HashSet<Order> placedOrder){
    this.placedOrder = placedOrder;
  }
  
  public void addPlacedOrder(Order placedOrder){
    this.placedOrder.add(placedOrder);
  }
  public void delPlacedOrder(Order placedOrder){
    this.placedOrder.remove(placedOrder);
  }
  
  public HashSet<Order> getPlacedOrder(){
    return placedOrder;
  }
  
  public void setWorker(HashSet<Employee> worker){
    this.worker = worker;
  }
  
  public void addWorker(Employee worker){
    this.worker.add(worker);
  }
  public void delWorker(Employee worker){
    this.worker.remove(worker);
  }
  
  public HashSet<Employee> getWorker(){
    return worker;
  }
  
}