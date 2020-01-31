public class Account {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;
    
    public static void showTotalCash(){
        System.out.println("Total Cash  : "+totalCash);
    }
    /*
    public static void showData(Account tmp){
        System.out.println(tmp.ano+","+tmp.name+","+balance);
    }
    */
    
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
