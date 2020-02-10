class DogClass extends AnimalClass
{
	DogClass()
	{
		//super must be declared at first 
		super("Bark", "great_nose", 21.5);
	}
}

class CatClass extends AnimalClass
{
	CatClass()
	{
		super("Meow", "Whisker", 20.5);
	}
}