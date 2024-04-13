public class aka {
	int a =12;
	void abc()
	{
		System.out.println("abc");
	}
}
class bk {
	aka a;
	void show()
	{
		a.abc();
		System.out.println("show");
	}
public static void main(String[] args) {
	bk obj= new bk();
   obj.a=new aka();
	obj.show();
}
}


