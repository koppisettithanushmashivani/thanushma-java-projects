import java.util.Scanner;
public class Palindromenumber {
    public static void main(String[] args) {
        System.out.println("please enter num:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int num=a;
        int b=0;
       while(a!=0){
        b=b*10 + a%10;
        a=a/10;
       }
       System.out.println(num);
       System.out.println(b);
       if (num == b){
        System.out.println("num is palindrome");
       }
       else{
        System.out.println("num is not a palindrome");
       }
       s.close();
    }
}