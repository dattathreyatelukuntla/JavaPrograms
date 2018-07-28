package Programs;
class parent1
{
	public void mhello()
	{
		System.out.println("hellooo");
	}
	public static  void add()
	{
		System.out.println("parent");
	}
}
class child1 extends parent1
{
	public static void add()
	{
		System.out.println("child");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		parent1 p=new child1();
		p.mhello();
		p.add();
		

	}

}
