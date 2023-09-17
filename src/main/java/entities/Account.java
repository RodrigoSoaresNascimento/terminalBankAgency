package entities;

import exceptions.BusinessRuleExpection;

public abstract class Account {

    private Double balance;

    private String number;

    private Integer agency;

    public Account(String number, Integer agency) {
        this.number = number;
        this.agency = agency;
        this.balance = 0.0;
    }

    public abstract double addBalance(Double balance) throws BusinessRuleExpection;

    public abstract double withdrawBalance(Double amount) throws BusinessRuleExpection;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }
}
