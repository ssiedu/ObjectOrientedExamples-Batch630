public class Student {

    private int rno;
    private String name;
    private int marks;
    private static int totalPass;
    private static int totalFail;
    
    public void showOverallResult(){
        System.out.println("Total Pass : "+totalPass);
        System.out.println("Total Fail : "+totalFail);
        System.out.println("________________________");
    }
    public void reportCard(){
        System.out.println("____________________________");
        System.out.println("Roll No. : "+rno);
        System.out.println("Name     : "+name);
        System.out.println("Marks    : "+marks);
        if(marks>=33){
            System.out.println("PASS");
            totalPass++;
        }else{
            System.out.println("FAIL");
            totalFail++;
        }
        System.out.println("____________________________");
    }
    public void setData(int a, String b, int c){
        rno=a;
        name=b;
        marks=c;
    }
    
}
