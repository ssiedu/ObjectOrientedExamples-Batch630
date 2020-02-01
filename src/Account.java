public class Account {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;

    public static void showAvg(Account tmp1, Account tmp2, Account tmp3){
        System.out.println("Avg of 3 : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
    }
    public static void showAvg(Account tmp1, Account tmp2){
        System.out.println("Avg of 2 : "+(tmp1.balance+tmp2.balance)/2);
    }
    
    
    
    public static void showTotalCash(){
        System.out.println("Total Cash  : "+totalCash);
    }
    public void showData(){
        System.out.println(ano+","+name+","+balance);
    }
    
    public void setData(int a, String b, int c){
        ano=a;
        name=b;
        balance=c;
        totalCash=totalCash+c;
    }
}
