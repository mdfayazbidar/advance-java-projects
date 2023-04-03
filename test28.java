// deserialization
import java.io.*;

public class test28 {

	public static void main(String[] args) throws Exception{
student obj1[]=new student[5];
FileInputStream filein=new FileInputStream("C:\\fayaz11\\CS2_students.ser");
ObjectInputStream in=new ObjectInputStream(filein);
obj1[0]=(student)in.readObject();
obj1[1]=(student)in.readObject();
obj1[2]=(student)in.readObject();
obj1[3]=(student)in.readObject();
obj1[4]=(student)in.readObject();
in.close();
filein.close();
System.out.println("Deserialized students....");
for(int i=0; i<5; i++) {
System.out.println("name:"+obj1[i].name);
System.out.println("regno:"+obj1[i].regno);
System.out.println("cgpa:"+obj1[i].cgpa);

	}
	}
}
