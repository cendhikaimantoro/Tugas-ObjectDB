/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entity.*;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ASUS-A451LB
 */
public class Delete {
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
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/PDL.odb" );
    */
    
      EntityManager em = emf.createEntityManager();  
      
        em.getTransaction().begin();
          em.createQuery("DELETE FROM entity.Branch").executeUpdate();
          em.createQuery("DELETE FROM entity.Card").executeUpdate();
          em.createQuery("DELETE FROM entity.Customer").executeUpdate();
          em.createQuery("DELETE FROM entity.Employee").executeUpdate();
          em.createQuery("DELETE FROM entity.Good").executeUpdate();
          em.createQuery("DELETE FROM entity.GoodInBranch").executeUpdate();
          em.createQuery("DELETE FROM entity.IDCard").executeUpdate();
          em.createQuery("DELETE FROM entity.Location").executeUpdate();
          em.createQuery("DELETE FROM entity.Order").executeUpdate();
          em.createQuery("DELETE FROM entity.OrderQty").executeUpdate();
        em.getTransaction().commit();

      em.close();
    emf.close();
  }
}
