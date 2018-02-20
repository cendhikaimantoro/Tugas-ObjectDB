/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashSet;
import javax.persistence.*;

/**
 *
 * @author Richard
 */
public class Branch {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    
    private String name;
    
    @OneToOne
    private Location location;
    private int area;
    
    @OneToMany
    private HashSet<Customer> customer;
    
    //TODO relationship set<Order> placedOrder inverse Order::orderPlace; + SETTER + GETTER
    //private HashSet<Order> placedOrder;
  
    @OneToMany
    private HashSet<Employee> worker;
    //TODO relationship set<Employee> worker inverse Employee::workplace; + SETTER + GETTER
    
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
    
    public String getName(){
        return name;
    }
    
    public Location getLocation(){
        return location;
    }
    
    public int getArea(){
        return area;
    }
    
    public HashSet<Customer> getCustomer(){
        return customer;
    }
    
    public HashSet<Employee> getWorker(){
        return worker;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLocation(Location location){
        this.location = location;
    }
    
    public void setArea(int area){
        this.area = area;
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
    
    public void setWorker(HashSet<Employee> worker){
        this.worker = worker;
    }
    
    public void addWorker(Employee worker){
        this.worker.add(worker);
    }
    
    public void delWorker(Employee worker){
        this.worker.remove(worker);
    }
    
}
