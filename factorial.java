import  java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int i,fact=1;
        int number = 2;
        for(i=1;i<=number;i++) {
            fact=fact*i;
        }
        System.out.println("factorial of "+number+" is:"+fact);
    }
}