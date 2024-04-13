import java.util.*;
public class loki {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<Object>();
        s.push(10);
        s.push(66);
        s.push("tom");
        s.push(44);
        s.push("jerry");
        s.pop();
System.out.println(s);
Object o = s.peek();
System.out.println(o);
Enumeration e=s.elements();
while(e.hasMoreElements())
{
    System.out.println(e.nextElement());
}
    }
}


//<E> generic type it can allow any type