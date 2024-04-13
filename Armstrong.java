import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args){
    System.out.println("please enter number:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int c=num;
    int a,b=0;
    while(num>0){
        a=num%10;
        num=num/10;
        b=b+(a*a*a);
    }
    if(b==c){
        System.out.println("armstrong");
    }
else{
    System.out.println("not armstrong");
}
    }
}