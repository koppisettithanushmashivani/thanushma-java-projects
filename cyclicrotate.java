import java.util.Arrays;
public class cyclicrotate
{
   static int arra[] = new int[]{1,2,3,4,5};
   static void rotate_array()
   {
       int a = arra[arra.length - 1];
       int i;
       for (i = arra.length - 1; i > 0; i--)
           arra[i] = arra[i - 1];
       arra[0] = a;
   }
   public static void main(String[] args)
   {
       System.out.println("Original array:");
       System.out.println(Arrays.toString(arra));
       rotate_array();
       System.out.println("Rotated array:");
       System.out.println(Arrays.toString(arra));
   }
}