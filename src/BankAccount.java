import java.time.LocalDateTime;

public class BankAccount {
    private final String ownerName;
    private int balance;
    private final LocalDateTime openDate;
    private boolean isBlocked;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.openDate = LocalDateTime.now();
        this.isBlocked = false;
    }

    public boolean deposit(int amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {
        if (isBlocked || amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount otherAccount, int amount) {
        if (isBlocked || otherAccount == null || amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        otherAccount.balance += amount;
        return true;
    }

    // Геттеры
    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    // Сеттер для блокировки
    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}


