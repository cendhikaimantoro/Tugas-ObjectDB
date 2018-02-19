/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Richard
 */
@Entity
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public enum Type {
        credit,
        debit;
    }
    
    @Id
    private String number;
    
    private String bank;
    private Type type;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastTransactionDate;
    private int totalTransaction;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date expirationDate;
        
    public Card(){
    }
    
    public Card(String number){
        this.number = number;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String getBank(){
        return bank;
    }
    
    public Type getType(){
        return type;
    }
    
    public Date getLastTransactionDate(){
        return lastTransactionDate;
    }
    
    public int getTotalTransaction(){
        return totalTransaction;
    }
    
    public Date getExpirationDate(){
        return expirationDate;
    }
    
    public void setBank(String bank){
        this.bank = bank;
    }
    
    public void setType(Type type){
        this.type = type;
    }
    
    public void setLastTransactionDate(Date lastTransactionDate){
        this.lastTransactionDate = lastTransactionDate;
    }
    
    public void setTotalTransaction(int totalTransaction){
        this.totalTransaction = totalTransaction;
    }
    
    public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
    }
}
