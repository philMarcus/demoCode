
public class PwdGeneratorTester {

	public static void main(String[] args) {
		PasswordGenerator p1 = new PasswordGenerator(6,"APCS");
		PasswordGenerator p2 = new PasswordGenerator(3);

		System.out.println(p1.pwGen());
		System.out.println(p2.pwGen());
		System.out.println(p1.pwGen());
		System.out.println(p2.pwGen());
		System.out.println(p1.pwGen());
		System.out.println(p2.pwGen());
		
		System.out.println("Count: "+p1.pwCount());
	}

}
