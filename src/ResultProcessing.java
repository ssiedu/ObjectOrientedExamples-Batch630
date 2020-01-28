
public class ResultProcessing {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rno=111;s1.marks1=50;s1.marks2=60; s1.marks3=70;
        Student s2=new Student();
        s2.rno=112;s2.marks1=40;s2.marks2=50; s2.marks3=60;
        Student s3=new Student();
        s3.rno=111;s3.marks1=20;s3.marks2=30; s3.marks3=40;
        System.out.println("Result of S1");
        s1.computeTotal();
        s1.computingPercentage();
        System.out.println("Result of S2");
        s2.computeTotal();
        s2.computingPercentage();
        System.out.println("Result of S3");
        s3.computeTotal();
        s3.computingPercentage();
        
    }
}
