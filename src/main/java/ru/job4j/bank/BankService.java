package ru.job4j.bank;

import ru.job4j.collection.Order;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        ArrayList<Account> account = new ArrayList<Account>();
        for (Account element : account) {
            if (!account.contains(element)) {
                users.put(user, account);
            }
        }

    }

    public void addAccount(String passport, Account account) {

    }

    public User findByPassport(String passport) {
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}