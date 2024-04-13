import java.util.*;
class fibonacci {
    public static void main(String[] args) {
    int num1=0,num2=1;
    int num3;
    int i=0;
    Scanner s=new Scanner(System.in);
    int count=s.nextInt();
    System.out.print(" "+num1);
    System.out.print(" "+num2);
    while(i<count) {
    num3=num1+num2;
    System.out.print(" "+num3);
    num1=num2;
    num2=num3;
    i++;
    }
}
}