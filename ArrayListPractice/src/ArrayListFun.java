import java.util.ArrayList;

public class ArrayListFun {

	public static void main(String[] args) {
		System.out.println(getListOfFactors(80));
	}
	
	public static ArrayList<Integer> getListOfFactors(int number){
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 2; i < number; i++) {
			if(number%i==0) {
				factors.add(i);
			}
		}
		return factors;
	}
	
	public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums) {
		
	}
	

}
