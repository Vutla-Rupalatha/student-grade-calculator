import java.util.Scanner;
class Student
{  
   protected int s1;
   protected int s2;
   protected int s3;
   protected int s4;
   protected int s5;
   protected int s6;
   void input()
   {
   System.out.println("enter 6 subject marks:");
   Scanner sc=new Scanner(System.in);
   s1=sc.nextInt();
   s2=sc.nextInt();
   s3=sc.nextInt();
   s4=sc.nextInt();
   s5=sc.nextInt();
   s6=sc.nextInt();
   }
  
}
class Totmarks extends Student
{
  static int total(int s1,int s2,int s3,int s4,int s5,int s6)
  {
    int tot=s1+s2+s3+s4+s5+s6;
    return tot;
  }
}
class Percentage extends Student
{
  float percentage()
  { 
    int tot=Totmarks.total(s1,s2,s3,s4,s5,s6);
    System.out.println("total marks:"+tot);
    return tot/6;
  }
}
class Grade extends Student
{ 
  void result(float avg){
  if(avg>=75){
    System.out.println("pass with Grade:A");
   }
  else if(avg>=60){
    System.out.println("pass with Grade:B");
   }
  else if(avg>=35){
    System.out.println("pass with Grade:C");
   }
 else{
   System.out.println("fail");
}
}
}  
class S
{
public static void main(String args[])
{
  Grade g=new Grade();
  Percentage p=new Percentage();
  p.input();
  float avg = p.percentage();
  System.out.println("pecentage:"+avg);
  g.result(avg);
 
 }
}
  