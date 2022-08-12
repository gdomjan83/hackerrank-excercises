package addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testAddTwoNumbers() {
        ListNode l1 = new ListNode(3);
        l1 = new ListNode(4, l1);
        l1 = new ListNode(2, l1);

        ListNode l2 = new ListNode(4);
        l2 = new ListNode(6, l2);
        l2 = new ListNode(5, l2);

        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(7, result.getVal());
        assertEquals(0, result.getNext().getVal());
        assertEquals(8, result.getNext().getNext().getVal());
    }

    @Test
    void testAddTwoOtherNumbers() {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);

        ListNode result = solution.addTwoNumbers(l1, l2);
        assertEquals(8, result.getVal());
        assertEquals(0, result.getNext().getVal());
        assertEquals(2, result.getNext().getNext().getVal());
    }
}