
public class VAExample {

    public static void add(int...v){
        int sum=0;
        for(int tmp:v){
            sum=sum+tmp;
        }
        System.out.println(sum);
    }
    
    public static void main(String...args) {
        int x[]={11,12};
        int y[]={5,6,7,8};
        add(x);
        add(y);
        
        add();//{}
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add(10,20,30,40,50);
        add(1,2,3,4,5,6,7,8,9,10);
        
    }
}
