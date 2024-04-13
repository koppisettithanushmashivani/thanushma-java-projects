public class garbage collector {
    int x = 5;
    int y = 10;
    public static void main(String[]args)
    {
        Demo obj = new Demo();
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj = null;
        obj1 = obj2;
    }
}
