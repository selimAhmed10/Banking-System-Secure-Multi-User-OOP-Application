package bankmanagement;
import java.util.ArrayList;

public abstract class Profile {
    static ArrayList<Profile> Profiles = new ArrayList<>();

    private String username, email, password, gender;

    public Profile(String username, String email, String password, String gender) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        Profiles.add(this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String Gender) {
        this.gender = Gender;
    }
}

class Client extends Profile {
    private int balance, loan, requestedLoan;
    private final ArrayList<Transaction> Transactions; 
    public Client(String username, String email, String password, String gender, int balance, int loan, int requestedLoan) {
        super(username, email, password, gender);
        this.balance = balance;
        this.loan = loan;
        this.requestedLoan = requestedLoan;
        Transactions = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactions() {
        return Transactions;
    }

    public int getRequestedLoan() {
        return requestedLoan;
    }

    public void setRequestedLoan(int requestedLoan) {
        this.requestedLoan = requestedLoan;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }
    
    public void deposit(int Amount){
        balance += Amount;
        Transactions.add(0, new Transaction(Amount, "Deposit"));
    }
    
    public void withdraw(int Amount){
        balance -= Amount;
        Transactions.add(0, new Transaction(Amount, "Withdraw"));
    }
    
    public void borrow(int Amount){
        balance += Amount;
        loan += Amount;
        Transactions.add(0, new Transaction(Amount, "Loan"));
    }

    public void repayLoan(int Amount){
        balance -= Amount;
        loan -= Amount;
        Transactions.add(0, new Transaction(Amount, "Repayment")); 
    }
    
    public void addTransaction(Transaction T){
        Transactions.add(T);
    }
}

class Admin extends Profile {
    static ArrayList<Client> LoanRequests = new ArrayList<>();
    public Admin(String username, String email, String password, String gender) {
        super(username, email, password, gender);
    }
    
    public ArrayList<Client> getLoanRequests(){
        return LoanRequests;
    }

    public void acceptLoan(Client p){
        p.setBalance(p.getBalance()+p.getRequestedLoan());
        p.setLoan(p.getLoan()+p.getRequestedLoan());
        p.addTransaction(new Transaction(p.getRequestedLoan(), "Loan"));
        p.setRequestedLoan(0);
        LoanRequests.remove(p);
    }
    
    public void rejectLoan(Client p){
        p.setRequestedLoan(0);
        LoanRequests.remove(p); 
    }
    
    public void removeProfile(Client p){
        if(LoanRequests.contains(p)){
            LoanRequests.remove(p);
        }
        Profile.Profiles.remove(p);
    }
}
