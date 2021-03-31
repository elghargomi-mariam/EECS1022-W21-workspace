package eecs1022.lab7.bank.model;

public class Transaction {
    private String option = "";
    private double amount = 0.0;
    private String status = "";

    public Transaction(String option, double amount){
        this.option = option;
        String format = "";
        format = String.format("%.2f", amount);
        this.amount = amount;
        this.status = "Transaction " + this.option + ": $" + format;
    }
    public String getStatus(){
        return this.status;
    }
}
