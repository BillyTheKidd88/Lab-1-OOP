
public class ArithmeticSequence extends Sequence{
	private int constant;
	private int current_element;
	private int A0;
	
	public ArithmeticSequence(int constant){
		this.constant = constant;
		A0 = current_element = 0;
	}
	
	public ArithmeticSequence(int constant, int first_element){
		this.constant = constant;
		A0 = current_element = first_element;
		
	}
	
	public void reset(){
		current_element = A0;
	}
	
	public int get_next_element(){
		current_element += constant;
		return current_element;
	}
	
	public int get_prev_element(){
		current_element -= constant;
		return current_element;
	}
	
	public int get_element_by_index(int index){
		current_element = (index)*constant + A0;
		return current_element;
	}
	
	public int get_sum_of_elements(int start_index, int end_index){
		int sum = (end_index-start_index)*(get_element_by_index(start_index-1)+get_element_by_index(end_index))/2;
		return sum;
	}
}
