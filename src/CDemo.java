
public class CDemo {

    private int x, y;
                
    public CDemo(CDemo tmp){
        x=tmp.x;
        y=tmp.y;
    }
    public CDemo(int a, int b){
        x=a; y=b;
    }
    public void showData(){
        System.out.println(x+","+y);
    }
    
    public static void main(String[] args) {
        
        CDemo ob1=new CDemo(10,20);
        CDemo ob2=new CDemo(30,40);
        CDemo ob3=new CDemo(ob2);
        ob1.showData();
        ob2.showData();
        ob3.showData();
        
        /*
        CDemo ob1=new CDemo(5,6);
        CDemo ob2=new CDemo(7,8);
        ob1.showData();
        ob2.showData();
        */
    }
}
