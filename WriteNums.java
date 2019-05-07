public class WriteNums {

	public static void main(String[] args) {
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
	}
	
	public static void writeNums(int n) {
		if(n < 1) {
			throw new IllegalArgumentException("writeNums not defined for 0 or negative n.");
		} else if(n == 1) {
			System.out.print(n);
		} else if(n > 1) {
			writeNums(n - 1);
			System.out.print(", ");
			System.out.print(n);			
		}
	}
}
