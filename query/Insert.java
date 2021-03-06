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
            Customer executiveCustomer1 = new Customer(iDCard1);
            executiveCustomer1.setBirthDate(new Date(96, 05, 17));
            executiveCustomer1.setName("Cendhika Imantoro");
            executiveCustomer1.setLocation(location1);
            executiveCustomer1.addPhoneNumber("085731330212");
            executiveCustomer1.addPhoneNumber("085755190017");
            executiveCustomer1.setDiscount(0.2f);
            em.persist(executiveCustomer1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Customer executiveCustomer2 = new Customer(iDCard2);
            executiveCustomer2.setBirthDate(new Date(97, 11, 24));
            executiveCustomer2.setName("Richard Wellianto");
            executiveCustomer2.setLocation(location2);
            executiveCustomer2.addPhoneNumber("082874638462");
            executiveCustomer2.setDiscount(0.15f);
            em.persist(executiveCustomer2);
          em.getTransaction().commit();
          //RegularCustomer
          em.getTransaction().begin();
            Customer regularCustomer1 = new Customer(iDCard3);
            regularCustomer1.setBirthDate(new Date(86, 6, 20));
            regularCustomer1.setName("Hafizh Dary F.H.");
            regularCustomer1.setLocation(location3);
            regularCustomer1.addPhoneNumber("085783665947");
            regularCustomer1.addPhoneNumber("085694385926");
            regularCustomer1.setPoint(100);
            em.persist(regularCustomer1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Customer regularCustomer2 = new Customer(iDCard4);
            regularCustomer2.setBirthDate(new Date(89, 6, 1));
            regularCustomer2.setName("Ahmad Sena M.S.");
            regularCustomer2.setLocation(location4);
            regularCustomer2.addPhoneNumber("088848569502");
            regularCustomer2.setPoint(150);
            em.persist(regularCustomer2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Customer regularCustomer3 = new Customer(iDCard5);
            regularCustomer3.setBirthDate(new Date(45, 8, 17));
            regularCustomer3.setName("Agus");
            regularCustomer3.setLocation(location5);
            regularCustomer3.addPhoneNumber("082843729473");
            regularCustomer3.setPoint(200);
            em.persist(regularCustomer3);
          em.getTransaction().commit();
          //HQ
          em.getTransaction().begin();
            Branch hq1 = new Branch("HQ-001");
            hq1.setName("HeadQuarter");
            hq1.setLocation(location6);
            hq1.setArea(2000);
            em.persist(hq1);
          em.getTransaction().commit();
          //NonHQ
          em.getTransaction().begin();
            Branch nonhq1 = new Branch("NHQ-001");
            nonhq1.setName("Kantor Cabang Cisitu");
            nonhq1.setLocation(location7);
            nonhq1.setArea(500);
            em.persist(nonhq1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Branch nonhq2 = new Branch("NHQ-002");
            nonhq2.setName("Kantor Cabang Kopo");
            nonhq2.setLocation(location8);
            nonhq2.setArea(1000);
            em.persist(nonhq2);
          em.getTransaction().commit();
          //Employee
          em.getTransaction().begin();
            Employee employee1 = new Employee("01-2014-03-05-01");
            employee1.setName("Ujang");
            employee1.setLocation(location9);
            employee1.addPhoneNumber("081345471223");
            employee1.setStartingDate(new Date(114, 5, 3));
            employee1.setBaseSalary(1500000);
            employee1.setBirthDate(new Date(80, 11, 13));
            em.persist(employee1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Employee employee2 = new Employee("02-2016-04-07-01");
            employee2.setName("Bonar");
            employee2.setLocation(location10);
            employee2.addPhoneNumber("082345729234");
            employee2.addPhoneNumber("081723450293");
            employee2.setStartingDate(new Date(116, 4, 7));
            employee2.setBaseSalary(2500000);
            employee2.setBirthDate(new Date(89, 10, 26));
            em.persist(employee2);
          em.getTransaction().commit();
        //Section 3 Card, Good
          //Card
          em.getTransaction().begin();
            Card card1 = new Card("1673894562789");
            card1.setBank("BNI");
            card1.setType(Card.Type.credit);
            card1.setLastTransactionDate(new Date(117,12, 29));
            card1.setTotalTransaction(1000000);
            card1.setExpirationDate(new Date(118,10, 30));
            em.persist(card1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Card card2 = new Card("3739473759302");
            card2.setBank("BCA");
            card2.setType(Card.Type.debit);
            card2.setLastTransactionDate(new Date(118,2, 5));
            card2.setTotalTransaction(165000);
            card2.setExpirationDate(new Date(120,5, 31));
            em.persist(card2);
          em.getTransaction().commit();
          //Good
          em.getTransaction().begin();
            Good good1 = new Good("Cl-001");
            good1.setDescription("Kagura's Clothes");
            good1.setColor("Red");
            good1.setSize("32AA");
            good1.setType("Clothing");
            good1.setQuantity(5);
            em.persist(good1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Good good2 = new Good("Sw-001");
            good2.setDescription("Gintoki's Bouken");
            good2.setColor("Brown");
            good2.setSize("70cm");
            good2.setType("Sword");
            good2.setQuantity(2);
            em.persist(good2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Good good3 = new Good("Ac-001");
            good3.setDescription("Shinpachi's Glasses");
            good3.setColor("Silver");
            good3.setSize("-4.50");
            good3.setType("Accessory");
            good3.setQuantity(7);
            em.persist(good3);
          em.getTransaction().commit();
        //Section 4 GoodInBranch Component
          //GoodInBranch
          em.getTransaction().begin();
            GoodInBranch goodinbranch1 = new GoodInBranch();
            goodinbranch1.setGoodQuantity(2);
            goodinbranch1.setStoredGood(good3);
            goodinbranch1.setStoringPlace(nonhq2);
            em.persist(goodinbranch1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            GoodInBranch goodinbranch2 = new GoodInBranch();
            goodinbranch2.setGoodQuantity(3);
            goodinbranch2.setStoredGood(good1);
            goodinbranch2.setStoringPlace(nonhq1);
            em.persist(goodinbranch2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            GoodInBranch goodinbranch3 = new GoodInBranch();
            goodinbranch3.setGoodQuantity(1);
            goodinbranch3.setStoredGood(good2);
            goodinbranch3.setStoringPlace(nonhq1);
            em.persist(goodinbranch3);
          em.getTransaction().commit();
          em.getTransaction().begin();
            GoodInBranch goodinbranch4 = new GoodInBranch();
            goodinbranch4.setGoodQuantity(1);
            goodinbranch4.setStoredGood(good2);
            goodinbranch4.setStoringPlace(nonhq2);
            em.persist(goodinbranch4);
          em.getTransaction().commit();
          em.getTransaction().begin();
            GoodInBranch goodinbranch5 = new GoodInBranch();
            goodinbranch5.setGoodQuantity(1);
            goodinbranch5.setStoredGood(good3);
            goodinbranch5.setStoringPlace(nonhq1);
            em.persist(goodinbranch5);
          em.getTransaction().commit();
        //Section 5 Order
          //Order
          em.getTransaction().begin();
            Order order1 = new Order("ORD001", nonhq1);
            order1.setOrderDate(new Date(118,2, 15));
            order1.setType(Order.Type.card);
            order1.setUsedCard(card1);
            order1.setCustomer(executiveCustomer1);
            order1.setHandler(employee1);
            em.persist(order1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Order order2 = new Order("ORD001", nonhq2);
            order2.setOrderDate(new Date(118,2, 18));
            order2.setType(Order.Type.cash);
            order2.setCustomer(regularCustomer1);
            order2.setHandler(employee2);
            em.persist(order2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            Order order3 = new Order("ORD002", nonhq1);
            order3.setOrderDate(new Date(118,2, 19));
            order3.setType(Order.Type.cash);
            order3.setCustomer(regularCustomer2);
            order3.setHandler(employee1);
            em.persist(order3);
          em.getTransaction().commit();
        //Section 6 OrderQty
          //OrderQty
          em.getTransaction().begin();
            OrderQty orderqty1 = new OrderQty();
            orderqty1.setOrderedGood(good3);
            orderqty1.setQuantity(1);
            em.persist(orderqty1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            OrderQty orderqty2 = new OrderQty();
            orderqty2.setOrderedGood(good2);
            orderqty2.setQuantity(1);
            em.persist(orderqty2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            OrderQty orderqty3 = new OrderQty();
            orderqty3.setOrderedGood(good1);
            orderqty3.setQuantity(2);
            em.persist(orderqty3);
          em.getTransaction().commit();
          em.getTransaction().begin();
            OrderQty orderqty4 = new OrderQty();
            orderqty4.setOrderedGood(good1);
            orderqty4.setQuantity(2);
            em.persist(orderqty4);
          em.getTransaction().commit();
        
          ///////////////PART 2
        //Section 1 Location, IDCard
          //Location
          
          //IDCard
          
        //Section 2 ExecutiveCustomer, RegularCustomer, HQ, NonHQ, Employee
          //ExecutiveCustomer
          em.getTransaction().begin();
            executiveCustomer1.addCard(card1);
            executiveCustomer1.setRegistrationBranch(nonhq1);
            executiveCustomer1.setConsultant(employee1);
            executiveCustomer1.addIssuedOrder(order1);
            em.persist(executiveCustomer1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            executiveCustomer2.setRegistrationBranch(nonhq2);
            executiveCustomer2.setConsultant(employee2);
            em.persist(executiveCustomer2);
          em.getTransaction().commit();
          //RegularCustomer
          em.getTransaction().begin();
            regularCustomer1.setRegistrationBranch(nonhq1);
            regularCustomer1.addIssuedOrder(order2);
            em.persist(regularCustomer1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            regularCustomer2.addCard(card2);
            regularCustomer2.setRegistrationBranch(nonhq2);
            regularCustomer2.addIssuedOrder(order2);
            em.persist(regularCustomer2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            regularCustomer2.setRegistrationBranch(nonhq1);
            em.persist(regularCustomer3);
          em.getTransaction().commit();
          //HQ
          
          //NonHQ
          em.getTransaction().begin();
            nonhq1.addCustomer(executiveCustomer1);
            nonhq1.addCustomer(regularCustomer1);
            nonhq1.addCustomer(regularCustomer3);
            nonhq1.addPlacedOrder(order1);
            nonhq1.addPlacedOrder(order3);
            nonhq1.addWorker(employee1);
            nonhq1.addStoredGood(goodinbranch2);
            nonhq1.addStoredGood(goodinbranch3);
            nonhq1.addStoredGood(goodinbranch5);
            em.persist(nonhq1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            nonhq2.addCustomer(executiveCustomer2);
            nonhq2.addCustomer(regularCustomer2);
            nonhq2.addPlacedOrder(order2);
            nonhq2.addWorker(employee2);
            nonhq2.addStoredGood(goodinbranch1);
            nonhq2.addStoredGood(goodinbranch4);
            em.persist(nonhq2);
          em.getTransaction().commit();
          //Employee
          em.getTransaction().begin();
            employee1.setBranch(nonhq1);
            employee1.addHandledOrder(order1);
            employee1.addHandledOrder(order3);
            employee1.addConsultedCustomer(executiveCustomer1);
            em.persist(employee1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            employee2.setBranch(nonhq2);
            employee2.addHandledOrder(order2);
            employee2.addConsultedCustomer(executiveCustomer2);
            em.persist(employee2);
          em.getTransaction().commit();
        //Section 3 Card, Good
          //Card
          em.getTransaction().begin();
            card1.addPaidOrder(order1);
            em.persist(card1);
          em.getTransaction().commit();
          //Good
          em.getTransaction().begin();
            good1.addStoringPlace(goodinbranch2);
            em.persist(good1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            good2.addStoringPlace(goodinbranch3);
            good2.addStoringPlace(goodinbranch4);
            em.persist(good2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            good3.addStoringPlace(goodinbranch1);
            good3.addStoringPlace(goodinbranch5);
            em.persist(good3);
          em.getTransaction().commit();
        //Section 4 GoodInBranch Component
          //GoodInBranch

          //Component

        //Section 5 Order
          //Order
          em.getTransaction().begin();
            order1.addOrderedGood(orderqty1);
            em.persist(order1);
          em.getTransaction().commit();
          em.getTransaction().begin();
            order2.addOrderedGood(orderqty2);
            order2.addOrderedGood(orderqty3);
            em.persist(order2);
          em.getTransaction().commit();
          em.getTransaction().begin();
            order3.addOrderedGood(orderqty4);
            em.persist(order3);
          em.getTransaction().commit();
        //Section 6 OrderQty
          //OrderQty
      em.close();
    emf.close();
  }
  
}
