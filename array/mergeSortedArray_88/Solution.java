package codingDrills.array.mergeSortedArray_88;

/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      while(m >= 1 && n >= 1) {
          if (nums1[m - 1] < nums2[n - 1]){
              nums1[m + n - 1] = nums2[n -1];
              n--;
          } else {
              nums1[m + n -1] = nums1[m - 1];
              m--;
          }
      }

      while(n >= 1) {
          nums1[m + n -1] = nums2[n-1];
          n--;
        }
    }
/* Not optimal
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0,nums1_copy,0, m);
        int idx = 0;
        int i;
        int j;

        for (i = 0, j = 0 ; i < m && j < n; ) {
            if (nums1_copy[i] < nums2[j]) {
                nums1[idx++] = nums1_copy[i++];
            } else {
                nums1[idx++] = nums2[j++];
            }
        }

            if (j < n) {
                System.arraycopy(nums2, j, nums1, idx, m + n - i - j);
            } else if (i < m) {
                System.arraycopy(nums1_copy, i, nums1, idx, m + n - i - j);

            }
    }

 */
}
