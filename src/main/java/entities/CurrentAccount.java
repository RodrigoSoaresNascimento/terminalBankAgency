package entities;

import exceptions.BusinessRuleExpection;

public class CurrentAccount extends Account{

    public CurrentAccount(String accountNumber, Integer agency) {
        super(accountNumber, agency);
    }

    @Override
    public double addBalance(Double balance) throws BusinessRuleExpection {
        if (balance < 0){
            throw new BusinessRuleExpection("O valor a ser adicionado não pode ser negativo!");
        }
        Double newBalance = getBalance()  + balance;
        setBalance(newBalance);
        return getBalance();
    }

    @Override
    public double withdrawBalance(Double amount) throws BusinessRuleExpection {
        if (amount > getBalance()){
            throw new BusinessRuleExpection("O valor não pode ser maior que o saldo"+getBalance());
        }
        Double newBalance = getBalance()  - amount;
        setBalance(newBalance);
        return getBalance();
    }



}
