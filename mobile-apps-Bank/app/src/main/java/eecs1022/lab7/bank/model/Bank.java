package eecs1022.lab7.bank.model;

public class Bank {
    private String[] statement = {};
    private String status = "";
    private Client[] clients = {};
    static boolean flagstat = false;
    static boolean trans = false;

    public String getStatus(){
        if(flagstat == false) {
            this.status = "Accounts: " + "{";
            for (int i = 0; i < this.clients.length; i++) {
                this.status += this.clients[i].getStatus();
                if (i != (this.clients.length - 1)) {
                    this.status += ", ";
                }
            }
            this.status += "}";
        }
        return this.status;
    }

    public String[] getStatement(String name){
        boolean flag = false;
        for(int i = 0; i < this.clients.length; i++){
            if(this.clients[i].getName() == name){
                flag = true;
                flagstat = false;
                return this.clients[i].getStatement();
            }
        }
        if(flag == false){
            this.status = "Error: From-Account " + name + " does not exist";
            flagstat = true;
        }
        return null;
    }

    public void deposit(String name, double amount){
        boolean flag = false;
        for (int i = 0; i < this.clients.length; i ++){
            if(this.clients[i].getName() == name){
                flag = true;
            }
        }
        if(flag == false){
            this.status = "Error: To-Account " + name +" does not exist";
            flagstat = true;
        }else if (amount <= 0){
            this.status = "Error: Non-Positive Amount";
            flagstat = true;
        }else {
            flagstat = false;
            for (int m = 0; m < this.clients.length; m++) {
                if (this.clients[m].getName() == name) {
                    this.clients[m].deposit(amount);
                    this.statement[m] = this.clients[m].getStatementString();
                }

            }
        }
    }

    public void withdraw(String name, double amount){
        boolean nameflag= false;
        boolean flag = false;
        for (int i = 0; i < this.clients.length; i ++){
            if(this.clients[i].getName() == name){
                nameflag = true;
                if(this.clients[i].getAccountBalance() < amount){
                    flag = true;
                }
            }
        }
        if(nameflag == false){
            this.status = "Error: From-Account " + name + " does not exist";
            flagstat = true;
        }else if(amount <= 0){
            this.status = "Error: Non-Positive Amount";
            flagstat = true;
        }else if(flag == true){
                this.status = "Error: Amount too large to withdraw";
                flagstat = true;
        }else{
            flagstat = false;
            for (int j = 0; j < this.clients.length; j ++){
                if (this.clients[j].getName() == name){
                    this.clients[j].withdraw(amount);
                    this.statement[j] = this.clients[j].getStatementString();
                }
            }
        }
    }

    public void transfer(String from, String to, double amount){
        boolean tooLarge = false;
        boolean fromNo = false;
        boolean toNo = false;
        for (int i = 0; i < this.clients.length; i ++){
            if(this.clients[i].getName() == from){
                fromNo = true;
                if (this.clients[i].getAccountBalance() < amount){
                    tooLarge = true;
                }
            }
            if(this.clients[i].getName() == to){
                toNo = true;
            }
        }
        if(fromNo == false){
            this.status = "Error: From-Account " + from + " does not exist";
            flagstat = true;
        }else if (toNo == false){
                this.status = "Error: To-Account " + to + " does not exist";
                flagstat = true;
        }else if(amount <= 0){
                    this.status = "Error: Non-Positive Amount";
                    flagstat = true;
        }else if(tooLarge == true){
                this.status = "Error: Amount too large to transfer";
                flagstat = true;
        }else{
            flagstat = false;
            for(int j = 0; j < this.clients.length; j ++){
                if(this.clients[j].getName() == from){
                    this.clients[j].withdraw(amount);
                    this.statement[j] = this.clients[j].getStatementString();
                }
                if(this.clients[j].getName() == to){
                    this.clients[j].deposit(amount);
                    this.statement[j] = this.clients[j].getStatementString();
                }
            }
        }
    }

    public void addClient(String name, double amount){
        boolean flag = false;
        for(int i = 0; i < this.clients.length; i++){
            if(this.clients[i].getName() == name){
                flag = true;
            }
        }
        if (this.clients.length >= 6){
                this.status = "Error: Maximum Number of Accounts Reached";
                flagstat = true;
        }else if(flag == true){
            this.status = "Error: Client " + name + " already exists";
            flagstat = true;
        }else if(amount <= 0){
                    this.status = "Error: Non-Positive Initial Balance";
                    flagstat = true;
        }else{
            flagstat = false;
            int length = this.statement.length + 1;
            String[] temp = new String[length];
            Client[] temp2 = new Client[length];
            for(int m = 0; m < temp.length; m ++){
                if(m < this.statement.length){
                    temp[m] = this.statement[m];
                    temp2[m] = this.clients[m];
                }else{
                    Client c = new Client(name, amount);
                    String index = c.getStatus();
                    temp[m] = index;
                    temp2[m] = c;
                }
            }
            this.statement = temp;
            this.clients = temp2;
        }
    }

}
