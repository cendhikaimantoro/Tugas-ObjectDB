/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entity.Customer;
import entity.IDCard;
import entity.Location;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.*;

/**
 *
 * @author ASUS-A451LB
 */
public class Insert {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
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
          Location l = new Location("Cisitu Baru 13", "Bandung", "Jawa Barat", "40135");
          em.persist(l);
        em.getTransaction().commit();

        em.getTransaction().begin();
          IDCard i = new IDCard("3573011705960001", "KTP");
          em.persist(i);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
          Customer c = new Customer();
          c.setIDCard(i);
          c.setBirthDate(new Date(96, 05, 17));
          c.setName("Cendhika Imantoro");
          c.setLocation(l);
          c.addPhoneNumber("085731330212");
          em.persist(c);
        em.getTransaction().commit();
      em.close();
    emf.close();
  }
  
}
