class Animal
{
void sound()
{
System.out.println("zzzz");
}
}
class Dog extends Animal
{
//Override the Animal Class Method
void sound()
{
System.out.println("Boww Boww");
}
}
class Cat extends Dog
{
//Override the Dog Class Method
void sound()
{
System.out.println("Meow Meow");
}
}
class Crow extends Animal
{
//Override the Animal Class Method
void sound()
{
System.out.println("Cow Cow Cow");
}
}

public class MethodOVerRaiding
{
public static void main(String args[])
{
Animal animal = new Animal();
animal.sound();
Dog dog = new Dog();
dog.sound();
Cat cat = new Cat();
cat.sound();
Crow crow = new Crow();
crow.sound();
}
}

