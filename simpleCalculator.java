import java.util.Scanner;
public class simpleCalculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        System.out.print("enter your number A=");
        int a=sc.nextInt();
        System.out.print("enter youyr number B=");
        int b=sc.nextInt();
int c= a+b;
System.out.println("sum is= " +c);
int d=a-b;
System.out.println("a-b " +d);
int e= a*b;
System.out.println("a*b " +e);
int f=a/b;
System.out.println("a/b " +f);



    }
}
