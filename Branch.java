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
    public boolean addNewCustomer(String customerName, double intialTransactionAmount) {
       /* if (findCustomer(customerName) == null) {
            this.cutomers.add(new Customer(customerName, intialTransactionAmount));
            return true;

        }
        */
        return false;
    }

}