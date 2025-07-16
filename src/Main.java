public class Main{

    public static void main (String args[]){

        BankAccount account1 = new BankAccount("Alice");
        account1.deposit(1000); //  баланс = 1000

        System.out.println(account1.getBalance());
        BankAccount account2 = new BankAccount("Bob");
        account1.transfer(account2, 500); // баланс Alice: 500, Bob: 500

        account1.setBlocked(true);
        account1.withdraw(100); // счёт заблокирован

        System.out.println(account1.getOwnerName());
        System.out.println(account1.getBalance());
    }
}
