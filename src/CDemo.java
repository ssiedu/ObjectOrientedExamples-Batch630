
public class CDemo  {

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
/*
constructors
----------------

1) constructor is a method like body having same name as their class with 
    no return type (not even void also), you can have access modifiers.
2) constructor may or may not have args.
3) constructors can be overloaded.
4) constructor is called implicitly (automatically) during object creation.
	(matching args)
5) when you do not write any constructor from your side,
    one no-arg constructor is internally supplied, that is called default constructor.
6) once you write your own constructor, default will lost.
7) generally constructors are used  for initializing the data members of an object
    during creation itself.
8) constructor will be called only once on an object where as a method can be
    invoked n no of times.
9) java do not supports copy-constructor.
10) one constructor of a class can invoke another constructor
    of the same class using this keyword.
for using this keyword to invoke a constructor
-------------------------------------------------------------

1) this must be the first statement in constructor.
2) matching constructor must exists.
3) cant call more than one constructor directly.
4) chaining is allowed.
5) recursive calls are not allowed.
6) only a constructor can invoke another constructor
	(you cant call them inside a method)
7) a constructor can invoke a method.


*/