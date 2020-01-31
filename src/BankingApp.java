
public class BankingApp {

    public static void main(String[] args) {
        Account ac1=new Account();
        Account ac2=new Account();
        Account ac3=new Account();
        
        ac1.setData(111,"AAA",10000);
        ac2.setData(112,"BBB",20000);
        ac3.setData(113,"CCC",30000);
        
        /*
        //static showData
        Account.showData(ac1);
        Account.showData(ac2);
        Account.showData(ac3);
        */
        
        ac1.showData();
        ac2.showData();
        ac3.showData();
        
        
        Account.showTotalCash();
       
        
    }
}
