package eecs1022.lab7.bank.model;

public class Client {
    private String status = "";
    private String name = "";
    private double accountBalance = 0.0;
    private String[] statement = {this.status};

    public Client(String name, double accountBalance){
        this.name = name;
        this.accountBalance = accountBalance;
        String format = "";
        format = String.format("%.2f", accountBalance);
        this.status = this.name + ": $" + format;
        this.statement[0] = this.status;
    }

    public String getName(){
        return this.name;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }
    public String getStatus(){
        String format = "";
        format = String.format("%.2f", this.accountBalance);
        String temp = "";
        temp = this.name + ": $" + format;
        this.status = temp;
        return this.status;
    }

    public String[] getStatement(){
        return this.statement;
    }

    public String getStatementString(){
        String result = "";
        result += "{";
        for (int i = 0; i < this.statement.length; i++) {
            result += this.statement[i];
            if (i != (this.statement.length - 1)) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
        String format = "";
        format = String.format("%.2f", this.accountBalance);
        this.status = this.name + ": $" + format;
        int length = this.statement.length + 1;
        String[] temp = new String[length];
        if (this.statement.length <= 11) {
            for (int i = 0; i < temp.length; i++) {
                if (i < this.statement.length) {
                    if (i == 0) {
                        temp[0] = this.status;
                    } else {
                        temp[i] = this.statement[i];
                    }

                } else {
                    Transaction thisClient = new Transaction("DEPOSIT", amount);
                    temp[i] = thisClient.getStatus();
                }
            }
            this.statement = temp;
        }
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
        String format = "";
        format = String.format("%.2f", this.accountBalance);
        this.status = this.name + ": $" + format;
        int length = this.statement.length + 1;
        String[] temp = new String[length];
        if (this.statement.length <= 11) {
            for (int i = 0; i < temp.length; i++) {
                if (i < this.statement.length) {
                    if (i == 0) {
                        temp[0] = this.status;
                    } else {
                        temp[i] = this.statement[i];
                    }
                } else {
                    Transaction thisClient = new Transaction("WITHDRAW", amount);
                    temp[i] = thisClient.getStatus();
                }
            }
            this.statement = temp;
        }
    }
}
