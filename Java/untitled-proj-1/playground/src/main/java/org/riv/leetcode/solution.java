package org.riv.leetcode;

public class solution {
    public static int[] twosum(int[] nums, int target) {
        // O (n^2)
        // Brute Force Method
        int[] indices = new int[2];
        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int j = i + 1; j < nums.length ; j++ ) {
                if ( nums[i] + nums[j] == target ) {
                    indices[0] = i ;
                    indices[1] = j ;
                }
        }   
    }
    return indices;
    }
    
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode sumnode = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            sumnode.next = new ListNode(sum % 10);
            sumnode = sumnode.next;
        }
        return sumnode;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int sum1 = 0;
        int sum2 = 0;

        for (int num : nums1) {
            sum1 += num;
        }

        for (int num : nums2) {
            sum2 += num;
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            return ((double)sum1 + (double)sum2) / ((double)nums1.length + (double)nums2.length);
        } else {
            return (sum1 + sum2) / (nums1.length + nums2.length);
        }
    }

    public boolean isPalindrome(int x) {
        String convert = Integer.toString(x);

        return true;
    }

    public static int[] shiftArray(int[] array) {

        if ( array.length == 0 ) {
            return array;
        }

        int temp = array[array.length - 1];
        for ( int i = array.length - 1; i >= -1 ; i-- ) {
            if ( i == -1 ) {
                array[i+1] = temp;
            }
            if ( i < array.length - 1 && i >= 0) {
                array[i+1] = array[i];
            }
        }
        return array;
    }
}
