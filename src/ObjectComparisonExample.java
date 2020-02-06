
public class ObjectComparisonExample {
    public static void main(String[] args) {

        Trial t1=new Trial(10,20);
        Trial t2=new Trial(10,20);
        Trial t3=t1;
        
        boolean b1=t1==t2;
        boolean b2=t1.equals(t2);
        
        System.out.println(b1);
        System.out.println(b2);
        
    }
}
