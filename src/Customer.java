import java.util.*;
public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName){
        this.customerName = customerName;
        transactions = new ArrayList<>();
    }
    public Customer(String customerName, double trAmount){
        this(customerName);
        transactions.add(trAmount);
    }
    public void addTransaction(double trAmount){
        transactions.add(trAmount);
    }
    public String getCustomerName(){
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
