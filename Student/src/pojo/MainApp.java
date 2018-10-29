package pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApp {

	public static void main(String[] args) {
		serialised();
		deSerialised();
	}

	private static void serialised() {
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try{
		 fout= new FileOutputStream(new File("Student.txt"));
		 oout= new ObjectOutputStream(fout);
		Student s= new Student(101,"Omkar Gupta");
		oout.writeObject(s);
		}
		catch(Exception e){
			e.printStackTrace();
		} finally{
			try{
			fout.close();
			oout.close();
			}catch(IOException e){
				e.printStackTrace();;
			}
		}
	}
	
	private static void deSerialised() {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try{
		 fin= new FileInputStream(new File("Student.txt"));
		 oin= new ObjectInputStream(fin);
		Student s=(Student) oin.readObject();
		System.out.println("Name = " + s.getName()+"\nRollNo = "+s.getRollno());
		}
		catch(Exception e){
			e.printStackTrace();
		} finally{
			try{
			fin.close();
			oin.close();
			}catch(IOException e){
				e.printStackTrace();;
			}
		}
		
	}

}
