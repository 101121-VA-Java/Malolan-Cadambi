package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		/*
		 * int alp = 65; for (int i = 0; i < 26; i++) { if (i==13) {
		 * System.out.println(" "); } System.out.print((char) (alp + i) + " "); }
		 */
		
		/*
	 * String s= "hello"; s = s.concat(" world"); System.out.println(s);
		 */
		
		/*
		 * int [] nums = {1,2,3,4,5,6}; int sum = 0; int x = 0; while (x < 3) {
		 * 
		 * sum += nums [x]; x++; } System.out.println(sum);
		 */
		
		String [] strings = {"a", "b", "c", "d"};
		int x = 3;
		System.out.println(strings[x--]);
		System.out.println(strings[--x]);
		System.out.println(strings[x--]);
		System.out.println(strings[x]);
		
		System.out.println(strings[++x]);
		
				
		
		
		
	}
}
