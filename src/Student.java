//this class represents the blueprint of a Student

public class Student {
    //properties of Student
    int rno;
    String name;
    int marks1, marks2, marks3;
    int total, per;
    //operations on student object
    public void computeTotal(){
        total=marks1+marks2+marks3;
        System.out.println("Total Marks : "+total);
    }
    public void computingPercentage(){
        per=total/3;
        System.out.println("Percentage : "+per);
    }
}
