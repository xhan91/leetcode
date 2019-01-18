#!/usr/local/bin/python3

# Definition for singly-linked list.
class ListNode:
  def __init__(self, x):
    self.val = x
    self.next = None

  def __str__(self):
    result = str(self.val)
    current_node = self
    while current_node.next:
      current_node = current_node.next
      result += ' -> ' + str(current_node.val)
    return result


class Solution:
  def addTwoNumbers(self, l1, l2):
    """
    :type l1: ListNode
    :type l2: ListNode
    :rtype: ListNode
    """
    extra_digit = 0
    p1 = l1
    p2 = l2
    root = None
    pre_node = None
    while p1 or p2:
      if p1 and p2:
        new_value = p1.val + p2.val + extra_digit
      elif p1:
        new_value = p1.val + extra_digit
      elif p2:
        new_value = p2.val + extra_digit
      if new_value >= 10:
        extra_digit = 1
        new_value = new_value - 10
      else:
        extra_digit = 0
      current_node = ListNode(new_value)
      if root == None:
        root = current_node
      else:
        pre_node.next = current_node
      pre_node = current_node
      if p1:
        p1 = p1.next
      if p2:
        p2 = p2.next
    if extra_digit:
      current_node.next = ListNode(1)
    return root



# test case
s = Solution()

l1 = ListNode(2)
l11 = ListNode(4)
l12 = ListNode(3)
l1.next = l11
l11.next = l12

l2 = ListNode(5)
l21 = ListNode(6)
l22 = ListNode(4)
l2.next = l21
l21.next = l22

print(l1)
print(l2)
print(s.addTwoNumbers(l1, l2))