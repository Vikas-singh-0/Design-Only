package LinkedList;

public class duplicate {
        public static void main(String[] args) {
                int[] arr = { 1, 1, 1, 2, 2, 3, 4, 5, 5, 5, 5 };
                int point = 0, i = 1;
                class Solution {
                        public int removeDuplicates(int[] nums) {
                                int j = 0;
                                for (int i = 0; i < nums.length; i++) {
                                        if (nums[j] != nums[i]) {
                                                j = j + 1;
                                                nums[j] = nums[i];
                                        }
                                }
                                return j + 1;
                        }
                }
        }
}
