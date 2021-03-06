/**
 * 
 */

/**
 * @author Trey
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean groupSum(int start, int[] array, int target){
		// do some sanity checking
		if(start < 0) return false;
		if(array == null || array.length < 1) return false;
		
		if(start >= array.length) return target == 0;
		
		int newTarget = target - array[start]; 
		return groupSum(start+1, array, newTarget) || groupSum(start+1, array, target);
	
	}
}
