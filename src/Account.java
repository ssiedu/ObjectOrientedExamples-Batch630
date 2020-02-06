public class Account {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;

    public Account(int ano, String name, int balance) {
        this.ano = ano;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
    }

    
    
    
    public static void showAvg(Account...tmp){
        int n=tmp.length;
        int totalBalance=0;
        for(int i=0; i<n; i++){
            totalBalance=totalBalance+tmp[i].balance;
        }
        System.out.println("Avg of : "+n+" : "+totalBalance/n);
    }
    /*
    public static void showAvg(Account tmp1, Account tmp2, Account tmp3, Account tmp4){
        System.out.println("Avg of 4 : "+(tmp1.balance+tmp2.balance+tmp3.balance+tmp4.balance)/4);
    }
    public static void showAvg(Account tmp1, Account tmp2, Account tmp3){
        System.out.println("Avg of 3 : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
    }
    public static void showAvg(Account tmp1, Account tmp2){
        System.out.println("Avg of 2 : "+(tmp1.balance+tmp2.balance)/2);
    }
    */
    
    
    public static void showTotalCash(){
        System.out.println("Total Cash  : "+totalCash);
    }
    public void showData(){
        System.out.println(ano+","+name+","+balance);
    }
    
    public void setData(int ano, String name, int balance){
        this.ano=ano;
        this.name=name;
        this.balance=balance;
        totalCash=totalCash+balance;
    }
}
