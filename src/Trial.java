public class Trial {

    private int x, y;
    public Trial(int a, int b){x=a;y=b;}
    public void show(){
        int x=500;
        System.out.println("X  : "+this.x);
        System.out.println("Y  : "+this.y);
    }

   
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trial other = (Trial) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
   
    
    public static void main(String[] args) {
        
        Trial t1;   //just creating a reference
        new Trial(10,20);
        Trial t2=new Trial(30,40); 
        Trial t3=t2;
        t1=t2;
        t1.show();
        t2.show();
        t3.show();
        System.out.println("__________________________");
        t3=new Trial(50,60);
        t2=t3;
        t1.show();
        t2.show();
        t3.show();
        System.out.println("__________________________");
        t1=new Trial(70,80);
        t1.show();
        t2.show();
        t3.show();
        
        
    }
}
