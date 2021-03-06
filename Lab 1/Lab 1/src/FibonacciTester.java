import java.util.Random;

public class FibonacciTester {
	public static void main(String[] args){
		final int []ref_Values = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765};
		Random rnd = new Random();
		FibonacciSequence seq = new FibonacciSequence();
		for (int i=0; i<20; i++){
			int next = seq.get_next_element();
			if (next != ref_Values[i+1]) {
				System.out.println("get_next_element Error F" + (i+1) + " is supposed to be " + ref_Values[i+1] + " but " + next+ " was calculated instead!");
			}
			if (seq.get_index() != i+1) {
				System.out.println("get_index Error1 index value retrieved " + seq.get_index() + " is different from expected " + i+1);            
			}
		}
		for (int i=20; i>0; i--){
			int prev = seq.get_prev_element();
			if (prev != ref_Values[i-1]) {
				System.out.println("Error F" + (i-1) + " is supposed to be " + ref_Values[i-1] + " but " + prev+ " was calculated instead!");
			}
			if (seq.get_index() != i-1) {
				System.out.println("get_index Error2 index value retrieved " + seq.get_index() + " is different from expected " + i+1);            
			}
		}
		for (int i=0; i<5; i++){
			int ii = rnd.nextInt(20);
			int elem = seq.get_element_by_index(ii);
			if (elem != ref_Values[ii]){
				System.out.println("get_element_by_index Error F" + (ii) + " is supposed to be " + ref_Values[ii] + " but " + elem + " was calculated instead!");            
			}
		}
	}
}
