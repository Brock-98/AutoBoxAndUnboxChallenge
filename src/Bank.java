import java.util.*;
public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName){
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    private Customer getCustomer(String customerName){
        for (Customer customer : customers) {
            if (customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
    public void addCustomer(String customerName,double trAmount){
        if(getCustomer(customerName)==null){
            customers.add(new Customer(customerName,trAmount));
        }

    }
    public void addTransaction(String customerName, Double trAmount){
        Customer customer = getCustomer(customerName);
        if( customer == null){
            System.out.println("No customer found");
        }
        else {
            customer.addTransaction(trAmount);
        }
    }
    public void printTransactions(String customerName){

        Customer customer = getCustomer(customerName);
        if(customer==null){
            System.out.println("No customer found");
            return;
        }

        for(double transaction : customer.getTransactions()){
            System.out.printf("%10.2f, %s%n",transaction,transaction<0?"debit":"credit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", customers=" + customers +
                '}';
    }
}
