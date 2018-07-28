package Programs;
class A1
{
	public A1(String type) {
		System.out.println(type);
	}
}
class B extends A1
{
	public B(String name) {
		
		super("hello");
		System.out.println(name);
		
	}
}
class C extends B
{

	public C(String add) {
		super(add);
		System.out.println(add);
	}

	
	
}
class D extends C
{

	public D(String add) {
		super(add);
		System.out.println("mahesh");
	}
	
}
public class Constructers {

	public static void main(String[] args) {
new D("durga");

	}

}
