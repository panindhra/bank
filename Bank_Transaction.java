public class Bank_Transaction {
    String account_name;
    String accountholder_name;
    String account_type;
    long account_number;
    double balance;

    public Bank_Transaction(String accName, String holderName, String type, long accNo, double bal) {
        this.account_name = accName;
        this.accountholder_name = holderName;
        this.account_type = type;
        this.account_number = accNo;
        this.balance = bal;
    }

    public static void main(String[] args) {
        Bank_Transaction transaction = new Bank_Transaction("SBI", "Unnati", "Saving", 1234567890L, 50000);
        System.out.println("Account Name: " + transaction.account_name);
        System.out.println("Account Holder: " + transaction.accountholder_name);
        System.out.println("Type: " + transaction.account_type);
        System.out.println("Number: " + transaction.account_number);
        System.out.println("Balance: ₹" + transaction.balance);
    }
}
