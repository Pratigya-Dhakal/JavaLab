class finalDemo
{
	static final int num1 = 5;

			final int num2;

				finalDemo()
				{
					num2 = 4;
				}

		public static void main(String[] args) {
			System.out.println(num1);
			finalDemo obj=new finalDemo();
					System.out.println(obj.num2);
		}
}