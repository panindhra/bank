public class Bank_Customer {
    String cust_name;
    int customer_id;
    String customer_address;

    public Bank_Customer(String name, int id, String address) {
        this.cust_name = name;
        this.customer_id = id;
        this.customer_address = address;
    }

    public static void main(String[] args) {
        Bank_Customer customer = new Bank_Customer("Unnati", 13, "Delhi");
        System.out.println("Customer Name: " + customer.cust_name);
        System.out.println("Customer ID: " + customer.customer_id);
        System.out.println("Customer Address: " + customer.customer_address);
    }
}
