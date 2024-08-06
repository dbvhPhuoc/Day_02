package org.example;

import java.util.Date;

public class Account {
    private long id;
    private String ownerName;
    private double balance;
    private Date acessTime;
    private boolean locked;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getAcessTime() {
        return acessTime;
    }

    public void setAcessTime(Date acessTime) {
        this.acessTime = acessTime;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
