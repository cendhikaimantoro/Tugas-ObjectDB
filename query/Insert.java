/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import entity.*;
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
      
      /*  em.getTransaction().begin();
          Location locationc = new Location("Cisitu Baru 13", "Bandung", "Jawa Barat", "40135");
          em.persist(locationc);
        em.getTransaction().commit();

        em.getTransaction().begin();
          IDCard idcard = new IDCard("3573011705960001", "KTP");
          em.persist(idcard);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
          Customer customer = new Customer(idcard);
          customer.setBirthDate(new Date(96, 05, 17));
          customer.setName("Cendhika Imantoro");
          customer.setLocation(locationc);
          customer.addPhoneNumber("085731330212");
          em.persist(customer);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
          Card card = new Card("123413501342");
          card.setBank("Bank Neraka");
          card.setType(Card.Type.debit);
          card.setLastTransactionDate(new Date(2018, 2, 14));
          card.setTotalTransaction(2500000);
          card.setExpirationDate(new Date(2018, 12, 25));
          em.persist(card);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
          Location locatione = new Location("Cisitu Baru 11", "Bandung", "Jawa Barat", "40135");
          em.persist(locatione);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
          Employee employee = new Employee("02-03-2014-05");
          employee.setName("Ujang");
          employee.setLocation(locatione);
          employee.addPhoneNumber("081345471223");
          employee.setStartingDate(new Date(2017, 5, 23));
          employee.setBaseSalary(1500000);
          employee.setBirthDate(new Date(1980, 11, 13));
          em.persist(employee);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
          IDCard idcardRegular = new IDCard("3573011705960002", "KTP");
          em.persist(idcardRegular);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
          RegularCustomer regularCustomer = new RegularCustomer(idcardRegular);
          regularCustomer.setBirthDate(new Date(96, 05, 17));
          regularCustomer.setName("Cendhika Imantoro");
          regularCustomer.setLocation(locationc);
          regularCustomer.addPhoneNumber("085731330212");
          em.persist(regularCustomer);
        em.getTransaction().commit();
      
        */
      
      
        //Section 1 Location, IDCard
          //Location
          
          //IDCard
          em.getTransaction().begin();
            IDCard iDCard1 = new IDCard("3573011705960001", "KTP");
            em.persist(iDCard1);
            IDCard iDCard2 = new IDCard("153753575947", "SIM");
            em.persist(iDCard2);
            IDCard iDCard3 = new IDCard("18463805074956", "PASSPORT");
            em.persist(iDCard3);
            IDCard iDCard4 = new IDCard("3475010819880004", "KTP");
            em.persist(iDCard4);
            IDCard iDCard5 = new IDCard("3456011804900005", "KTP");
            em.persist(iDCard5);
          em.getTransaction().commit();
          
        //Section 2 ExecutiveCustomer, RegularCustomer, HQ, NonHQ, Employee
          //ExecutiveCustomer
          
          //RegularCustomer
          
          //HQ
          
          //NonHQ
          
          //Employee
          
        //Section 3 Card, Good
          //Card
          
          //Good
          
        //Section 4 GoodInBranch Component
          //GoodInBranch
          
          //Component
          
        //Section 5 Order
          //Order
          
        //Section 6 OrderQty
          //OrderQty
          
      em.close();
    emf.close();
  }
  
}
