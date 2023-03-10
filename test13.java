
class FactThread extends Thread {
	String name1;
	int number;
	long Fact=1;
	

	public   FactThread(String name1,int number) {
		 
		 this.name1=name1;
		 this.number=number;
		 System.out.println(name1+"thread started");
		 
	 } 
public void run() {
	try {
		for(int i=1; i<=number; i++) {
			System.out.println(name1+"is executing");
		Fact=Fact*i;
		Thread.sleep(2000);
	}
} catch (Exception e) {}
System.out.println(name1+" thread factrial "+Fact);
       
}}
public class test13 {

	public static void main(String[] args) throws Exception{
		FactThread t1=new FactThread("fisrt",3);
		FactThread t2=new FactThread("second",4);
		FactThread t3=new FactThread("third",5);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
	}

}

