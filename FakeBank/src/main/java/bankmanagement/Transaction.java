package bankmanagement;

public class Transaction {
    private int Amount;
    private String Type;

    public Transaction(int Amount, String Type) {
        this.Amount = Amount;
        this.Type = Type;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
}
