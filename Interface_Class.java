interface Animal 
{
	protected abstract void display();
}

class Dog implements Animal
{
	void display(){
		System.out.println("Yes you are dog");
	}
}

class Cat implements Animal
{
	void display(){
		System.out.println("Yes you are cat");
	}
}
public class Interface_Class
{
	public static void main(String[] x)
	{
		Animal a = new Dog(); //we cannot create object of interface but we can create reference var of interface
		Dog d = new Dog();
		Cat c = new Cat();
		a.display();
		d.display();
		c.display();
	}
}