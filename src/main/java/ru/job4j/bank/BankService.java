package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if ( !users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());

        }
    }

    public void deleteUser(String passport) {

        User user = findByPassport(passport);
        if (user != null) {
            users.remove(user);
        }
    }

    public void addAccount(String passport, Account account) {
            boolean bal = true;
         User user = findByPassport(passport);
        if (user!=null) {
            List<Account> accounts = users.get(user);
            for (Account accountis : accounts) {
                if (accountis.equals(account)) {
                    bal = false;
                }

            }
            if (bal) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User value = null;
        for (User key : users.keySet()) {
            if (Objects.equals(key.getPassport(), passport)) {
                value = key;
            }
        }
        return value;

    }


    public Account findByRequisite(String passport, String requisite) {
        Account value = null;
       User key =  findByPassport(passport);
            if( key!=null){
         List<Account> accounts =  users.get(key);
                for (Account account : accounts){
                    if (Objects.equals(account.getRequisite(), requisite)){
                        value = account;
                    }
                }

       }
        return value ;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;

       Account shet = findByRequisite(sourcePassport,sourceRequisite);
        Account shet2 = findByRequisite(destinationPassport,destinationRequisite);

        if (shet!=null && shet2!=null && shet.getBalance() >= amount && shet!=shet2){

            shet.setBalance(shet.getBalance()-amount);
           shet2.setBalance(shet2.getBalance()+amount);
          result= true;
        }

        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}