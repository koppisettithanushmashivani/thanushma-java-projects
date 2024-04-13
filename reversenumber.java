import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args){
        Scanner s = new  Scanner(System.in);
        int number=56789;
        int rev=0;
        while(number !=0)
        {
            int rem=number%10;
            rev = rev*10+rem;
            number = number/10;
        }
        System.out.println(rev+"is the reverse of the number");
    }
}
