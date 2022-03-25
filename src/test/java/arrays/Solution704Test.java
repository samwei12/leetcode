package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 森叶
 * @date 2022/3/25 21:40
 * @email xiaosen.dxs@alibaba-inc.com
 */
public class Solution704Test {

    @Test
    public void search() {
        int[] nums = {-1,0,3,5,9,12};
        int search = -1;
       search = new Solution704().search(nums, 9);
        assertEquals(search, 4);

        search = new Solution704().search(nums, 2);
        assertEquals(search, -1);

        search = new Solution704().search(nums, 0);
        assertEquals(search, 1);

        int[] nums3 = {2,5};
        search = new Solution704().search(nums3, 2);
        assertEquals(search, 0);
    }
}