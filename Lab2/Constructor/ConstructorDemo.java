class Const
{
	int num1, num2, roll;
	String name;

// Default constructor
	Const()
	{
		roll = 1;
		num1 = num2 = 7;
	}

// parameterized constructor
	Const(String name)
	{
		this.name = name;
	}

// object constructor
	Const(Const ob)
	{
		ob.roll = roll;
	}

	void showName()
	{
		System.out.println(name);
	}

	void showRoll()
	{
		System.out.println(roll);
	}
}

class ConstructDemo
{
	public static void main(String[] args)
	{
		Const obj = new Const();
			System.out.println("The Concat Element is " + obj.num1+obj.num2);
		Const ob = new Const("Pratigya");
			ob.showName();
		Const ob1 = new Const(obj);
			ob1.showRoll();
	} 
}