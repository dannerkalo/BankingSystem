import java.util.ArrayList;

public class Customer {
    private String customerName = "";
    private ArrayList<Double> cutomerTransactions;

    //
    public Customer(String name, double initialCutomerTransaction){
        this.customerName = name;
        this.cutomerTransactions = new ArrayList<Double>();
        this.addTransactionAmount(initialCutomerTransaction);
    }

     //Instance methods of CustomerClass
    public void addTransactionAmount(double initialTransactionAmount){
         this.cutomerTransactions.add(initialTransactionAmount);
    }

    public String getCustomerName(){
        return customerName;
    }

    public ArrayList<Double> getCustomerTransaction(){
        return cutomerTransactions;
    }

}