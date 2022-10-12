package unit;

public class Calculator {
    public static int findBig (int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

	public static int findSmall(int x, int y) {
		if (x < y) {
            return x;
        } else {
            return y;
        }
	}

    // Takes any amount of integers and returns the largest
    public static int findBiggest(int... nums) {
        int biggest = nums[0];
        // System.out.println(String.format("Starting with %s", biggest));
        for (int i = 1; i < nums.length; i++) {
            // System.out.println(String.format("Comparing %s to %s", biggest, nums[i]));
            if (nums[i] > biggest) {
                biggest = nums[i];
            }
        }
        return biggest;
    }

    public static boolean findAvgMarks(int x, int y, int z) {
        if ((x + y + z) / 3 >= 70) {
            return true;
        } else {
            return false;
        }
    }
}
