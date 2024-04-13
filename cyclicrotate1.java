import java.util.Arrays;
 class cyclicrotate1 {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        int[]aa=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            int index=(i+1)%arr.length;
            aa[index]=arr[i];
            
        }
        System.out.println(Arrays.toString(aa));
       
      
    }
}



 class cyclicrotate2 {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
        int[]aa=new int[arr.length];
       aa[1]=arr[0];
       aa[2]=arr[1];
       aa[3]=arr[2];
       aa[4]=arr[3];
       aa[0]=arr[4];
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(aa));

    }
}