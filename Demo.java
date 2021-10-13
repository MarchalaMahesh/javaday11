package javaday11;

public class Demo 
{
	public static void main(String[] args)
	{
		
		Thread t = new Thread(new Demo1());
		Thread t1 = new Thread(new Demo1());
		Thread t2 = new Thread(new Demo1());
		t1.start();
		System.out.println(t1.getName() +" t1");
		try
		{
			t1.sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println("exception is caught");
		}
t2.start();
System.out.println(t2.getName()+"t2");
t.start();
System.out.println(t.getName()+" t3");
		
				
	}

}
class Demo1 implements Runnable
{
	public void run()
	{
		System.out.println("hello from run()");
	}
	
}