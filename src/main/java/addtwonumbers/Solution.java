package addtwonumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummyNode = new ListNode(0);
        List<Integer> resultList = new ArrayList<>();
        int carryOver = 0;
        while (temp1.getNext() != null || temp2.getNext() != null) {
            carryOver = saveAdditionToList(temp1, temp2, resultList, carryOver);
            temp1 = temp1.getNext() != null ? temp1.getNext() : dummyNode;
            temp2 = temp2.getNext() != null ? temp2.getNext() : dummyNode;
        }
        carryOver = saveAdditionToList(temp1, temp2, resultList, carryOver);
        if (carryOver == 1) {
            resultList.add(carryOver);
        }
        return createResultNode(resultList);
    }

    private int saveAdditionToList(ListNode node, ListNode anotherNode, List<Integer> resultList, int carryOver) {
        int addition = node.getVal() + anotherNode.getVal() + carryOver;
        if (addition >= 10) {
            addition -= 10;
            carryOver = 1;
        } else {
            carryOver = 0;
        }
        resultList.add(addition);
        return carryOver;
    }

    private ListNode createResultNode(List<Integer> additionList) {
        ListNode resultNode = new ListNode(additionList.get(additionList.size() - 1));
        for (int i = additionList.size() - 2; i >= 0; i--) {
            ListNode tempNode = new ListNode(additionList.get(i), resultNode);
            resultNode = tempNode;
        }
        return resultNode;
    }
}