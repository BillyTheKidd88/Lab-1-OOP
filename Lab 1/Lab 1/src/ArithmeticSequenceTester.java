
public class ArithmeticSequenceTester {

	public static void main(String[] args) {
		ArithmeticSequence seq = new ArithmeticSequence(3,1);
		for(int i = 0; i < 6; i++){
			System.out.println(seq.get_element_by_index(i));
		}
		System.out.println(seq.get_sum_of_elements(0, 6));
		
		ArithmeticSequence seq2 = new ArithmeticSequence(-5,15);
		for(int i = 0; i < 6; i++){
			System.out.println(seq2.get_element_by_index(i));
		}
		System.out.println(seq2.get_sum_of_elements(2, 4));
	}

}
