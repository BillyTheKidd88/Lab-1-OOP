public class GeometricSequenceTester {
  public static void main(String[] args) {
    GeometricSequence seq = new GeometricSequence(2,4);
		for(int i = 0; i < 6; i++){
			System.out.print(seq.get_element_by_index(i) + " ");
		}
		System.out.println(seq.get_sum_of_elements(0, 6));

		GeometricSequence seq2 = new GeometricSequence(-5,5);
		for(int i = 5; i < 10; i++){
			System.out.print(seq2.get_element_by_index(i) + " ");
		}
		System.out.println("Sum: " + seq2.get_sum_of_elements(5, 10));
  }
}
