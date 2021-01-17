package cn.martind;

public class Main {
    public static void main(String[] args) {
        // System.out.println("hello world");
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double ans = new Main().findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int count = len1 + len2;
        int i = 0, j = 0;
        double res = 0, res1 = 0, res2 = 0;
        if (count % 2 == 1) {
            while (i < len1 || j < len2) {
                boolean isExist1 = (i < len1 && j < len2 && nums1[i] < nums2[j]) || (i < len1 && j >= len2);
                if (isExist1) {
                    res = nums1[i];
                    i++;
                } else {
                    res = nums2[j];
                    j++;
                }
                if (i + j == (count / 2) + 1) {
                    return res;
                }
            }
        }
        while (i < len1 || j < len2) {
            boolean isExist1 = (i < len1 && j < len2 && nums1[i] < nums2[j]) || (i < len1 && j >= len2);
            if (isExist1) {
                res = nums1[i];
                i++;
            } else {
                res = nums2[j];
                j++;
            }
            if (i + j == (count / 2)) {
                res1 = res;
            }
            if (i + j == (count / 2) + 1) {
                return (res1 + res) / 2.0;
            }
        }
        return res;
    }
}


