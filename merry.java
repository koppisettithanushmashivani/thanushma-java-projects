public class merry{
public static void main(String[] args){
    try{
        int a[]=new int[6];
        a[7] = 1/0;
    }
    catch(ArithmeticException ae)
    {
    System.out.println("ArthmeticException ae");
    }
    catch(ArrayIndexOutOfBoundsException ae)
    {
       System.out.println("ArrayIndexOutOfBoundsException ae"); 
    }
    }
    }