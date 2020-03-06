import java.io.*;
class ExceptionThrow{
	void a()throws IOException{
		throw new IOException("Device Error");
	}
	void b()throws IOException{

		a();
	}
	void c(){
		try{
			b();

		}
		catch(Exception e){
			System.out.println("Exception handeled");
		}
	}
	public static void main(String[] args) {
		ExceptionThrow obj= new ExceptionThrow();
		obj.c();
		System.out.println("Normal Flow");
	}
}
