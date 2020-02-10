abstract class Place
{
	abstract void landScape();
	abstract boolean haveSnow();
}

class MountainClass extends Place
{
	//overRidding the abstract class
	void landScape(){
		System.out.println("It has high landScape");
	}

	boolean haveSnow()
	{
		return true;
	}
}

// Multilevel inheritance
class HillClass extends MountainClass
{
	boolean haveSnow()
	{
		return false;
	}
}

class Abstract_Class
{
	public static void main(String[] args) {
		HillClass obj1 = new HillClass();
		obj1.landScape();

			System.out.println("it has snow: " + obj1.haveSnow());

		MountainClass obj = new MountainClass();
		obj.landScape();

			System.out.println("it has snow: " + obj.haveSnow());
	}
}