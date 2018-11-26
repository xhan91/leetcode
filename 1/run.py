#!/usr/local/bin/python3

class Solution:
  def twoSum(self, nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    dic = {}
    for index, val in enumerate(nums):
      dic[val] = index
    
    for index, val in enumerate(nums):
      res = target - val
      try:
        # this is to check that for [3,2,4] 6 does not return [0,0]
        if dic[res] != index:
          return [index, dic[res]]
        else:
          continue
      except:
        continue

# test case
if __name__ == '__main__':
  s = Solution()
  print(s.twoSum([2,7,11,15], 9))
  print(s.twoSum([3,2,4], 6))
