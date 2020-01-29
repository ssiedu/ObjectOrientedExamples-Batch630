//this class represents the blueprint of a Student

public class Student {
    //properties of Student
    private int rno;
    private String name;
    private int marks1, marks2, marks3;
    private int total, per;
    //operations on student object
    public void setData(int a, String b, int m1, int m2, int m3){
        rno=a;
        name=b;
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }
    public void computeTotal(){
        total=marks1+marks2+marks3;
        System.out.println("Total Marks : "+total);
    }
    public void computingPercentage(){
        per=total/3;
        System.out.println("Percentage : "+per);
    }
    public static void info(){
        
    }
}
