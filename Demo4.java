package javaday11;

public class Demo4 
{
	public static void main(String[] args)
	{
		Demo8 d = new Demo8("thread1");
		System.out.println(d.getName());
		System.out.println(d.getId());
	}
	

}
class Demo8 extends Thread
{
	Demo8(String s)
	{
		super(s);
	}
	
}