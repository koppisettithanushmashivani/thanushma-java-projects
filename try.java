public class winter {
public static void main(String[] args){
try{
    int a[]=new int[6];
    a[7]=1/0;
}
catch(ArthmeticException ae)
{
System.out.println("ArthmeticException ae");
}
catch(ArrayIndexOutOfBounds ae)
{
   System.out.println("ArrayIndexOutOfBounds ae"); 
}

}}