// it crates single thread to print 1to 5
// total two thread(main one)
class MyThread extends Thread{
String name;	
MyThread(String threadname){
	name=threadname;
	System.out.println("one"+"thread created");
}
public void run() {
	for(int i=1;i<=5; i++) {
System.out.println(i);
}
}
}
public class SingleThreadTest {

	public static void main(String[] args) throws Exception  {
		System.out.println("main thread begins");
		System.out.println("hello");
		// context switch
		MyThread m1=new MyThread("one");
		m1.start();
		Thread.sleep(5000);
		System.out.println("bye");

	
}
}
