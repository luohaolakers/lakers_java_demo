package demo;

public class Data {
    public int[] getBody() {
        int[] nums = new int[100000];
        for (int i = 1; i < nums.length + 1; i++) {
            nums[i - 1] = i;
        }
        return nums;
    }
}


