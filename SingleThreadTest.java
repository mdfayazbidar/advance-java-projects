// it crates single thread to print 1to 5
// total two thread(main one)
class MyThread extends Thread{
String name;	
MyThread(String threadname){
	name=threadname;
	System.out.println(name+"thread created");
}
public void run() {
	try {
	for(int i=1;i<=5; i++) {
System.out.println(name+""+i);
Thread.sleep(1000);
}
}catch(Exception e) {}
}
}
public class SingleThreadTest {

	public static void main(String[] args) throws Exception  {
		System.out.println("main thread begins");
		System.out.println("hello");
		// context switch
		MyThread m1=new MyThread("one");
		MyThread m2=new MyThread("two");
		MyThread m3=new MyThread("thee");
		MyThread m4=new MyThread("four");
		MyThread m5=new MyThread("fifth");
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		Thread.sleep(5000);
		System.out.println("bye");

	
}
}
