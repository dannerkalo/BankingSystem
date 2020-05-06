import java.util.ArrayList;

public class Branch {
    // Instance fields of branchClass
    private String branchName = "";
    private ArrayList<Customer> cutomers;

    public Branch(String branchName) {
        // intializing branch constructor
        this.branchName = branchName;
        this.cutomers = new ArrayList<Customer>();
    }

    // Instance methods of BranchClass
    public String getBranchName() {
        return branchName;
    }
//
    public ArrayList<Customer> getCustomers(){
        return cutomers;
    }

    //
    public boolean addNewCustomer(String customerName, double intialTransactionAmount) {
       if (findCustomer(customerName) == null) {
            this.cutomers.add(new Customer(customerName, intialTransactionAmount));
            return true;

        }
        return false;
    }

    //
    public boolean addCustomerTransaction(String customerName, double initialTransactionAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransactionAmount(initialTransactionAmount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.cutomers.size(); i++) {
            Customer checkedCustomer = this.cutomers.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

}