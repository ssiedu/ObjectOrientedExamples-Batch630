public class Account {
    private int ano;
    private String name;
    private int balance;
    private static int totalCash;
    
    public void showTotalCash(){
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
