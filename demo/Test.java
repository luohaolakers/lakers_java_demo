package demo;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) throws Exception {
        Data data = new Data();
        int[] nums = data.getBody();
        int target = 40000;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
//            System.out.println(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int two = target - nums[i];
            if (!map.containsKey(two)) {
                continue;
            }
            int indexNum = map.get(two);
            if ((target == nums[i] + nums[indexNum])) {
                System.out.println(nums[i] + " & " + nums[indexNum]);
                System.out.println("下标所在位置：" + i + " & " + indexNum);

            }
        }
    }
}
