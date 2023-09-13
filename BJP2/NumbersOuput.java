public class NumbersOutput {
    public static final int REP = 6; 
	public static final int RANGE = 10; 
    
	public static void main(String[] args) {
		// control structure: statement that controls other statements
		for (int i = 1; i <= REP; i++) {
			for (int j = 1; j < RANGE; j++) {
				System.out.print(" ");
			}
				System.out.print("|");
		}
		System.out.println();
			for (int k = 1; k <= (RANGE * REP); k++) {
				System.out.print(k % RANGE);
			}
	}
}
