import java.util.LinkedList;

public class AnimalQueue {

	public LinkedList<Dog> dogList;
	public LinkedList<Cat> catList;

	public AnimalQueue() {
		dogList = new LinkedList<Dog>();
		catList = new LinkedList<Cat>();
	}

	public void enqueue(Animal animal) {
		if (animal instanceof Cat) {
			catList.addLast((Cat) animal);
		} else {
			dogList.addLast((Dog) animal);
		}
	}

	public Animal dequeueAny() {
		if (dogList.peekFirst().isOlderThan(catList.peekFirst())) {
			return dogList.removeFirst();
		} else {
			return catList.removeFirst();
		}
	}

	public Dog dequeueDog() {

		return dogList.removeFirst();

	}

	public Cat dequeueCat() {

		return catList.removeFirst();

	}

}
