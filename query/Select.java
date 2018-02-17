/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entity.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ASUS-A451LB
 */
public class Select {
  public static void main(String[] args) {
    // TODO code application logic here
    
    /* 
    // Server Source, Exported Config
    Map<String, String> properties = new HashMap<>();
    properties.put("javax.persistence.jdbc.user", "admin");
    properties.put("javax.persistence.jdbc.password", "admin");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(
        "objectdb://"+Config.server+":"+Config.port+"/"+Config.odb+, properties);
    */
    
    // Local Source, Exported Config
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/"+Config.db );
    
    /*
    // Local Source, Hardcoded Config
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/customer.odb" );
    */
    
      EntityManager em = emf.createEntityManager();  
        
        // TODO Select Query 1
        {
          Query q = em.createQuery("SELECT c FROM entity.Customer c", Customer.class);
          List<Customer> results = q.getResultList();
          for (Customer c : results){
            System.out.println(c.getName());
          }
        }
        
        // TODO Select Query 2
        // TODO Select Query 3
        // TODO Select Query 4
        // TODO Select Query 5
        // TODO Select Query 6
        // TODO Select Query 7
        // TODO Select Query 8
        // TODO Select Query 9
        // TODO Select Query 10
        // TODO Select Query 11
        // TODO Select Query 12
        // TODO Select Query 13
        // TODO Select Query 14
        // TODO Select Query 15
        // TODO Select Query 16
        // TODO Select Query 17
        // TODO Select Query 18
        // TODO Select Query 19
        // TODO Select Query 20
        

      em.close();
    emf.close();
  }
}
