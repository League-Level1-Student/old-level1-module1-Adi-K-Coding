
public class Car {

int numberOfWheels;
String favoriteGasType;

Car(String favoriteGasType, int numberOfWheels) {
	this.favoriteGasType = favoriteGasType;
	this.numberOfWheels = numberOfWheels;
}

void vroom() {
	System.out.println("*vrooms*");
}

void drive() {
	System.out.println("*drives around*");
}
}