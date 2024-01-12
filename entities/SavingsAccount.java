package entities;

//conta poupança
public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Taxa de Juros:" + (int)(getInterestRate() * 100) + "%";
    }

    public Double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withDraw(Double amount){
        //sem taxa de saque
        this.balance -= amount;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
