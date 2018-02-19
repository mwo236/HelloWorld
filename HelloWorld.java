public class HelloWorld {
	public static pow(long x, long a) {
		long n = 1;
		for(int i = 0; i < a; i++) {
			n *= x;
		}
		return n;
	}
	public static void main(String [] args) {
		for(int i = 0; i < 32; i++) {
			long n = (long)i;
			long x = pow(2,n);
			System.out.print("2^" + n + " = " + x + "\n"); 
		}
		System.out.print("I love JAVA. JAVA is fun.");
	}
}