import java.util.Math;

public class GeometricSequence extends Sequence {
  private int constant;
  private int base;
  private int current_element;

  public GeometricSequence(int constant) {
    this.constant = constant;
    base = current_element = 1;
    indx = 0;
  }

  public GeometricSequence(int constant, int current_element) {
    this.current_element = current_element;
    this.constant = constant;
    base = current_element;
    indx = 0;
  }

  public int get_next_element() {
    current_element = current_element * constant;
    indx += 1;
    return current_element;
  }

  public int get_prev_element() {
    current_element = current_element / constant;
    indx -= 1;
    return current_element;
  }

  public int get_element_by_index(int index) {
    current_element = Math.pow(constant,index-1) * base;
    indx = index;
    return current_element;
  }

  public int get_sum_of_elements(int start_index, int end_index) {

    if (constant == 1) {
      return (end_index - start_index ) * base;
    }
    else if (-1 < constant < 1) {
      int start_sum = (base * (1 - Math.pow(constant,start_index))/(1 - constant));
      int end_sum = (base * (1 - Math.pow(constant,end_index-1))/(1 - constant));
      return = end_sum - start_sum;
    }
    int sum = get_element_by_index(start_index);
    for (int i = start_index + 1; i < end_index; i++) {
      sum += get_next_element();
    }
    return sum;
  }
}