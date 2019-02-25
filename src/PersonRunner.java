
public class PersonRunner {

	public static void main(String[] args) {
		Person bob = new Person();
		bob.setName("Bob");
		bob.setSuperpower("Flight");
		Person jim = new Person();
		jim.setName("Jim");
		jim.setSuperpower("Invisibility");
		Person tim = new Person();
		tim.setName("Tim");
		tim.setSuperpower("Jack-Jack");
//	System.out.println(bob.getName());
//	System.out.println(bob.getSuperpower());
//	System.out.println(jim.getName());
//	System.out.println(jim.getSuperpower());
//	System.out.println(tim.getName());
//	System.out.println(tim.getSuperpower());
	System.out.println(bob.toString());
	System.out.println(jim.toString());
	System.out.println(tim.toString());
	}

}
