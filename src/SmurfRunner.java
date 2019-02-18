
public class SmurfRunner {

	public static void main(String[] args) {
		Smurf H = new Smurf("Handy");
		System.out.println(H.getName());
		H.eat();
		System.out.println(H.getHatColor());
		System.out.println(H.isGirlOrBoy());
		Smurf P = new Smurf("Papa");
		System.out.println(P.getName());
		P.eat();
		System.out.println(P.getHatColor());
		System.out.println(P.isGirlOrBoy());
		Smurf S = new Smurf("Smurfette");
		System.out.println(S.getName());
		S.eat();
		System.out.println(S.getHatColor());
		System.out.println(S.isGirlOrBoy());
	}

}
