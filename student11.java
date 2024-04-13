public class student11 {
    void rollno(){
        System.out.println(410);
    }
    void name(){
        System.out.println("thanu");
    }
    void address(){
        System.out.println("aparna enclave");
    }
}
class student11_2 extends student11{
    void phoneno(){
        System.out.println(678088635);
    }
    void email(){
        System.out.println("thanushmashetti04@gamil.com");
    }
    public static void main(String[] args) {
        student11_2 obj = new student11_2();
       obj.name();
       obj.rollno();
        obj.phoneno();
        obj.email();
        
    }
}


class Student {
	int rollno;
	String name;
	String address;
}
class Student2 extends Student {
	String phoneno;
	String email;
    public String toString() {
        return"welcome";
    }
}
class Stude{
public static void main(String[] args) {
	Student2 obj = new Student2();
	obj.rollno=410;
	obj.name="shetty";
	obj.address="hyd";
	obj.phoneno="6303094458";
	obj.email="thanushmashivanikoppisetti@gmail.com";
	System.out.println(obj);
}
}
	
	
	