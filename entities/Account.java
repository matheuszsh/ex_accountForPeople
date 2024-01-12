package entities;

//conta comum
public class Account {
    //Atributos da conta: número, Titular, saldo;
    private Integer number;
    private String holder;
    protected Double balance;

    public Account()
    {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Conta:" + "\n\n" +
                "Número:" + number + "\n" +
                "Titular:" + holder + "\n" +
                "Saldo:" + balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //método de saque
    public void withDraw(Double amount){
        //aplicando uma taxa de R$7 no saque
        this.balance -= amount + 7.0;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }
}
