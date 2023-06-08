/*
@id         1
@title      Two Sum
@tag        Sort, Two Pointers
@author     CryoVit
@date       2023/06/08
*/

class Solution {
    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int pivot = nums[(l + r) >> 1];
            while (i <= j) {
                while(nums[i] < pivot) i++;
                while(nums[j] > pivot) j--;
                if (i <= j) swap(nums, i++, j--);
            }
            quickSort(nums, l, j);
            quickSort(nums, i, r);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = nums[i];
        }
        quickSort(sorted, 0, n - 1);
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (sorted[i] + sorted[j] > target) {
                j--;
            } else if (sorted[i] + sorted[j] < target) {
                i++;
            } else {
                break;
            }
        }
        for (int k = 0; k < n; k++) {
            if (nums[k] == sorted[i]) {
                ans[0] = k;
                break;
            }
        }
        for (int k = n - 1; k >= 0; k--) {
            if (nums[k] == sorted[j]) {
                ans[1] = k;
                break;
            }
        }
        return ans;
    }
}
