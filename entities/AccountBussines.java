package entities;

//conta empresarial
public class AccountBussines extends Account {
    private Double loanLimit;

    public AccountBussines(){
        super();
    }

    public AccountBussines(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Empréstimo:" + getLoanLimit();
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    @Override
    public void withDraw(Double amount){
        //super: para reutilizar a método da superClasse
        super.withDraw(amount);
        balance -= 5.0;
    }

    public void loan(Double amount){
        if (amount <= loanLimit) {
            balance += amount - 10.0; ;
        }
    }
}
