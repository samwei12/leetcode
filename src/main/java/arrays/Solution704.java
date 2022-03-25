package arrays;

/**
 * @author 森叶
 * @date 2022/3/25 21:40
 * @email xiaosen.dxs@alibaba-inc.com
 */
public class Solution704 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (target > nums[nums.length - 1] || target < nums[0]) {
            return -1;
        }
        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        }
        if (target == nums[0]) {
            return 0;
        }
        int left = 0;
        int right = nums.length;
        int result = right / 2;
        while (left < right) {
            result = (left + right) / 2;
            if (target == nums[result]) {
                return result;
            }
            if (result == left && target > nums[result]) {
                return -1;
            }
            if (result == right && target < nums[result]) {
                return -1;
            }
            if (target > nums[result]) {
                left = result;
            } else {
                right = result;
            }
        }
        return -1;
    }
}
