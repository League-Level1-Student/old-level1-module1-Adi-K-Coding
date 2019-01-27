
public class Duck {
	int numberOfFriends;
	String favoriteFood;

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	void quack() {
		System.out.println("*quax*");
	}

	void waddle() {
		System.out.println("*waddles around*");
	}
}
