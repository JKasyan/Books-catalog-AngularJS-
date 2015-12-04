package catalog.angularjs;

/**
 * Created by evgen on 03.12.15.
 */
public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k = i; k <= j; k ++) {
            sum += nums[k];
        }
        return sum;
    }
}
