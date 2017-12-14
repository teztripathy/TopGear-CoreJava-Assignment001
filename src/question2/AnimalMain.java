/*
 * 2. There is an animal class which has the common characteristics of all animals. 
 * Dog, Horse, Cat are animals(sub-class). Each can shout, but each shout is different. 
 * Use polymorphism to create objects of same and using an animal variable,
 * make each of the animals shout.
 */

package question2;
public class AnimalMain {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.shout();
		Cat c = new Cat();
		c.shout();
		Dog d = new Dog();
		d.shout();
		Horse h = new Horse();
		h.shout();
	}
}
