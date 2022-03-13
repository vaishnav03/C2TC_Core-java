import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int size = in.nextInt();
		int[]nums = new int[size];
		for(int j = 0; j< size; j++) {
			nums[j] = in.nextInt();
		}
		int[] resultIndexs = twoSum(nums, target);
		System.out.println(Arrays.toString(resultIndexs));
	}
	public static int[] twoSum(int[]nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> checkValue = new HashMap<>();
		for(int i = 0; i<nums.length; i++) {
			if(checkValue.get(target - nums[i]) != null && checkValue.get(target - nums[i])!= i) {
				result[0] = checkValue.get(target - nums[i]);
				result[i] = i;
			} else {
				checkValue.put(nums[i], i);
			}
		}
		return result;
	}
}
			