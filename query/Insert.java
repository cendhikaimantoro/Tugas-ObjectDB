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
          em.getTransaction().begin();
            Location location1 = new Location("Cisitu Baru 13", "Bandung", "Jawa Barat", "40135");
            em.persist(location1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location2 = new Location("Otista 352", "Bandung", "Jawa Barat", "40123");
            em.persist(location2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location3 = new Location("Kebon Jati 20", "Bandung", "Jawa Barat", "40111");
            em.persist(location3);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location4 = new Location("Ginza 203", "Tokyo", "Tokyo", "Z-235");
            em.persist(location4);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location5 = new Location("S.A.Maulana 34", "Berau", "Kalimantan Timur", "77312");
            em.persist(location5);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location6 = new Location("Naripan 32", "Bandung", "Jawa Barat", "40115");
            em.persist(location6);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location7 = new Location("Cisitu Baru 50", "Bandung", "Jawa Barat", "40135");
            em.persist(location7);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location8 = new Location("Kopo 234", "Bandung", "Jawa Barat", "40114");
            em.persist(location8);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location9 = new Location("Soekarno Hatta 23", "Pekanbaru", "Riau", "23452");
            em.persist(location9);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Location location10 = new Location("Imam Bonjol 23", "Padang", "Sumatera Barat", "42666");
            em.persist(location10);
          em.getTransaction().commit();
          //IDCard
          em.getTransaction().begin();
            IDCard iDCard1 = new IDCard("3573011705960001", "KTP");
            em.persist(iDCard1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            IDCard iDCard2 = new IDCard("153753575947", "SIM");
            em.persist(iDCard2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            IDCard iDCard3 = new IDCard("18463805074956", "PASSPORT");
            em.persist(iDCard3);
          em.getTransaction().commit();
          em.getTransaction().begin();
            IDCard iDCard4 = new IDCard("3475010819880004", "KTP");
            em.persist(iDCard4);
          em.getTransaction().commit();
          em.getTransaction().begin();
            IDCard iDCard5 = new IDCard("3456011804900005", "KTP");
            em.persist(iDCard5);
          em.getTransaction().commit();
          
        //Section 2 ExecutiveCustomer, RegularCustomer, HQ, NonHQ, Employee
          //ExecutiveCustomer
          em.getTransaction().begin();
            ExecutiveCustomer executiveCustomer1 = new ExecutiveCustomer(iDCard1);
            executiveCustomer1.setBirthDate(new Date(96, 05, 17));
            executiveCustomer1.setName("Cendhika Imantoro");
            executiveCustomer1.setLocation(location1);
            executiveCustomer1.addPhoneNumber("085731330212");
            executiveCustomer1.addPhoneNumber("085755190017");
            em.persist(executiveCustomer1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            ExecutiveCustomer executiveCustomer2 = new ExecutiveCustomer(iDCard2);
            executiveCustomer2.setBirthDate(new Date(97, 11, 24));
            executiveCustomer2.setName("Richard Wellianto");
            executiveCustomer2.setLocation(location2);
            executiveCustomer2.addPhoneNumber("082874638462");
            em.persist(executiveCustomer2);
          em.getTransaction().commit();
          //RegularCustomer
          em.getTransaction().begin();
            RegularCustomer regularCustomer1 = new RegularCustomer(iDCard3);
            regularCustomer1.setBirthDate(new Date(86, 6, 20));
            regularCustomer1.setName("Hafizh Dary F.H.");
            regularCustomer1.setLocation(location3);
            regularCustomer1.addPhoneNumber("085783665947");
            regularCustomer1.addPhoneNumber("085694385926");
            em.persist(regularCustomer1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            RegularCustomer regularCustomer2 = new RegularCustomer(iDCard4);
            regularCustomer2.setBirthDate(new Date(89, 6, 1));
            regularCustomer2.setName("Ahmad Sena M.S.");
            regularCustomer2.setLocation(location4);
            regularCustomer2.addPhoneNumber("088848569502");
            em.persist(regularCustomer2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            RegularCustomer regularCustomer3 = new RegularCustomer(iDCard5);
            regularCustomer3.setBirthDate(new Date(45, 8, 17));
            regularCustomer3.setName("Hafizh Dary F.H.");
            regularCustomer3.setLocation(location5);
            regularCustomer3.addPhoneNumber("082843729473");
            em.persist(regularCustomer3);
          em.getTransaction().commit();
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
