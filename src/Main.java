public class main {

    public static void main(String[] args){
        Customer customer = new Customer("Bob S", 1000.00);
        System.out.println(customer);

        Bank bank = new Bank("Chase");
        bank.addCustomer("Jane A", 500.00);
        System.out.println(bank);
        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("Jane A", -75.01);
        System.out.println(bank);
        bank.printTransactions("Jane A");
    }
}
