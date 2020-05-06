import java.util.ArrayList;

public class Bank {
    //
    private  ArrayList<Branch> branches;
    public Bank(Branch branch){
        this.branches = new ArrayList<Branch>();
    }

    //Instace Methods
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null ){
            this.branches.add(new Branch((branchName)));
            return true;
        }
        return false;
    }

  //
  public boolean addNewBranch(String branchName, String customerName, double intialTransactionAmount) {
      Branch branch = findBranch(branchName);
    if (branch != null) {
        return branch.addNewCustomer(customerName, intialTransactionAmount);
     }
     return false;
 }

 //
 public boolean addCustomerTransaction(String branchName, String customerName, double intialTransactionAmount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
        return branch.addNewCustomer(customerName, intialTransactionAmount);
     }
     return false;
 }

 //
    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listingCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer for branch: " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() + "[" + i + "]");
                if(showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getCustomerTransaction();
                    for(int j=0; j<transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Transaction amount" + transactions.get(j));
                    }
                }

            }
        }

        return false;

    }

}