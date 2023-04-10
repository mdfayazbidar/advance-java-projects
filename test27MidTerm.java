//student serializable
import java.io.Serializable;
import java.io.*;
class student implements Serializable{
	int regno;
	String name;
	double cgpa;
	public student(int regno,String name,double cgpa) {
		this.regno=regno;
		this.name=name;
		this.cgpa=cgpa;
	}
}

public class test27 {

	public static void main(String[] args)throws Exception{
		
student obj1=new student(0017,"md fayaz1",7.5);
student obj2=new student(0012,"md fayaz2",7.5);
student obj3=new student(0013,"md fayaz3",7.5);
student obj4=new student(0020,"md fayaz4",7.5);
student obj5=new student(0021,"md fayaz5",7.5);
FileOutputStream fileout=new FileOutputStream("C:\\fayaz11\\CS2_students.ser");
ObjectOutputStream out=new ObjectOutputStream(fileout);
out.writeObject(obj1);
out.writeObject(obj2);

out.writeObject(obj3);

out.writeObject(obj4);

out.writeObject(obj5);

out.close();
System.out.println("serialization data is saved//fayaz11/students.der");

	}

}
