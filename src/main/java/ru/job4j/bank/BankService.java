package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.putIfAbsent(user, new ArrayList<>());
        }
    }

    public boolean deleteUser(String passport) {
        boolean rsl = false;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.remove(user);
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl;
        Account src = this.findByRequisite(srcPassport, srcRequisite);
        Account dest = this.findByRequisite(destPassport, destRequisite);
        if (src == null || dest == null || src.getBalance() < amount) {
            rsl = false;
        } else {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
