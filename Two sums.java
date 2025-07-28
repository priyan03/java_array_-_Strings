import java.util.HashMap;
import java.util.Arrays;

public class TwoSumTest {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[0]; // not expected to reach here if one solution is guaranteed
    }

    public static void main(String[] args) {
        // Sample input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println("Indices: " + Arrays.toString(result)); // Output: [0, 1]
    }
}
