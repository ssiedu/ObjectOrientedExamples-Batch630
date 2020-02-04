public class CTest {
    private int x, y, z;

    public void f1(){
    }
    
    public CTest(){
        f1();
    }
                        
    public  CTest(int a, int b){
        this();
        x=a; 
        y=b;
    }
    
    public CTest(int p, int q, int r){
        this(p,q);
        z=r;
    }
    
    public void showData(){
        System.out.println(x+","+y+","+z);
    }
    
    public static void main(String args[]){
        CTest ob1=new CTest(10,20);
        CTest ob2=new CTest(30,40,50);
        ob1.showData();
        ob2.showData();
        
    }
}
