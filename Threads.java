package javaday11;

public class Threads {
public static void main(String[] args) 
{
	String name = Thread.currentThread().getName();
	
	System.out.println("thread name "+name);
	
	System.out.println(Thread.currentThread().getId());
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().getState());
	System.out.println(Thread.currentThread().isDaemon());
}
}
