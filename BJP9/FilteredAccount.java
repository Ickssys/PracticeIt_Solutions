public class FilteredAccount extends Account{
    private int transactions;
    private int zeroTransactions;

    public FilteredAccount(Client c){
        super(c);
        transactions = 0;
        zeroTransactions = 0;
    }

    @Override
    public boolean process(Transaction t){
        transactions++;
        int value = t.value();
        if(value == 0){
            zeroTransactions++;
            return true;
        }else{
            return super.process(t);
        }
    }

    public double percentFiltered(){
        if(transactions == 0){
            return 0.0;
        }
        return (double) zeroTransactions / transactions * 100.0;

    }
}