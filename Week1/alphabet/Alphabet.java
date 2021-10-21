package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		int alp = 65;
		for (int i = 0; i < 26; i++) {
			if (i==13) {
				System.out.println(" ");
			}
			System.out.print((char) (alp + i) + " ");
		}
	}
}
