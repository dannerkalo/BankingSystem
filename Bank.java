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

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

}