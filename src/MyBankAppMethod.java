public class MyBankAppMethod {
    private int pin;

    private double balance;

    public MyBankAppMethod() {
        this.balance = 0;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


    public double deposit(double deposit) {
        if(deposit <= 0){
            System.out.println("Deposit must be greater than zero");
         }

        double depositedAmount = deposit + getBalance();
        setBalance(depositedAmount);
         return getBalance();
    }


public double withdraw(double withdraw,int password) {
     if (withdraw >  getBalance() || withdraw <= 0) {
        System.out.println("Insufficient Funds");
        return getBalance();
    }
    if (getPin() == password) {
        double withDrawAmount =  getBalance()-withdraw;
        setBalance(withDrawAmount);

    } else {
        System.out.println("Incorrect Pin");
    }
    return  getBalance();
 }
    public double checkBalance(int pin) {
        if (getPin() == pin) {
            return getBalance();
        }
        else {
            System.out.println("Incorrect Pin");
        }
        return getBalance();
    }
    }

