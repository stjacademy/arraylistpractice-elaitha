import java.util.ArrayList;

public class ArrayListFun {

	public static void main(String[] args) {
//		Test code
//		System.out.println(getListOfFactors(80));
//		ArrayList <Integer> testArray = new ArrayList<Integer>();
//		testArray.add(72);
//		testArray.add(3);
//		testArray.add(19);
//		testArray.add(6);
//		testArray.add(4);
//		testArray.add(2);
//		testArray.add(1);
//		keepOnlyCompositeNumbers(testArray);
//		System.out.println(testArray);
	}
	/**
	 * A method to get a list of all factors excluding one and the number input
	 * @param number The input to get the factors of
	 * @return An ArrayList of factors of the input
	 */
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}
	
	/**
	 * A method to keep only the composite numbers in an ArrayList
	 * @param nums the ArrayList to remove non-composite numbers from
	 */
	public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums) {
		for (int i = nums.size() - 1; i >= 0; i--) {
			if (getListOfFactors(nums.get(i)).size() == 0) {
				nums.remove(i);
			}
		}
	}

}
