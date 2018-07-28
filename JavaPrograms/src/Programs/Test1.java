package Programs;

class A
{
	
	static void value(int...a)
	{
		System.out.println(a);
		
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		A.value(23,34,56,88);
		
	}

}
