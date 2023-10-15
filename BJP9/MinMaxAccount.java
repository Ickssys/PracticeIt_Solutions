public class MinMaxAccount extends BankingAccount{
    private int min;
    private int max;
    
    public MinMaxAccount(Startup s){
        super(s);
        min = getBalance();
        max = getBalance();
    }
    
    public int getMin(){
        return min;
    }
    
    public int getMax(){
        return max;
    }
    
    public void debit(Debit d){
        super.debit(d);
        updateBalance();
    }
    
    public void credit(Credit c){
        super.credit(c);
        updateBalance();
    }
    
    public int updateBalance(){
        int balance = getBalance();
        if(balance < min){
            min = balance;
        }else if(balance > max){
            max = balance;
        }
        return balance;
    }
    
}