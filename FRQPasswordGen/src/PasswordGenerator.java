
public class PasswordGenerator {

	private String prefix;
	private int length;
	private static int count;
	
	public PasswordGenerator(int len, String pre) {
		prefix = pre;
		length = len;
	}
	
	public PasswordGenerator(int len) {
		prefix = "A";
		length = len;
	}
	
	public String pwGen() {
		String pw = prefix + ".";
		
		for(int i=0; i<length;i++) {
			pw += (int)(Math.random()*10);
		}
		count++;
		return pw;
	}
	
	public int pwCount() {
		return count;
	}
}
