class mummy {
    int a = 23;
    void add(int[] arr)
    {
        int sum=0;
        for(int a:arr)
        {
            sum = sum+a;
        }
    }
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        A obj = new A();
        System.out.println(obj.a);
        System.out.println(new A().a);
        new A().a = 45;
        obj.a =105;
        System.out.println(new A().a);
        System.out.println(obj.a);
    }
}
}