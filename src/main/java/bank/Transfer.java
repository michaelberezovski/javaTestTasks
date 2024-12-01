package bank;

import java.util.ArrayList;

public class Transfer {

    private ArrayList<Account> list = new ArrayList<>();

    private void transfer(Account account1, Account account2, int amount) {
        if (checkIfEnoughMoneyToTransfer(account1, amount)
                || account1.isActive()
                || account2.isActive())
        {
            account1.setAmount(account1.getAmount() - amount);
            account2.setAmount(account2.getAmount() + amount);
        }
    }

    private boolean checkIfEnoughMoneyToTransfer(Account account, int amount) {
        if (account.getAmount() - amount < 0) {
            throw new IllegalArgumentException("Not enough money, buddy");
        }
        return true;
    }

    private ArrayList<Account> notActive(ArrayList<Account> accounts) {
        ArrayList<Account> notActive = new ArrayList<>();
        for (Account a : accounts) {
            if (!a.isActive()) {
                notActive.add(a);
            }
        }
        return notActive;
    }

    private Account getById(ArrayList<Account> list ,int id) {
        Account account = null;
        for (Account a : list) {
            if (a.getId() == id) {
                account = a;
            }
        }
        return account;
    }
}
