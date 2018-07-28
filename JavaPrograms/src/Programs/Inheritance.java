package Programs;
class Parent
{
	protected int a;
	String name="hai";
}
class child extends Parent
{
	
}
public class Inheritance {

	public static void main(String[] args) {
		child c=new child();
		System.out.println(c.a);
		System.out.println(c.name);

	}

}
