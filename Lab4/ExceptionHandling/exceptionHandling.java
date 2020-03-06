class exceptionHandling{
	boolean div(){
		int a=10;
		try{
			System.out.println(a/0);
		}
		catch(ArithmeticException b){
			System.out.println(b);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("This block provide one time code run");
		}
		return false;
	}
	public static void main(String[] args) {
		exceptionHandling obj=new exceptionHandling();
		System.out.println(obj.div());
	}
}