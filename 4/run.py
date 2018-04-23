class Solution:
  def findMedianSortedArrays(self, nums1, nums2):
    l1 = len(nums1)
    l2 = len(nums2)
    length = l1 + l2
    isEven = length % 2 == 0
    i_m = int(length / 2)
    nums = []
    while l1 + l2 > 0:
      if not l1:
        nums.append(nums2[0])
        nums2 = nums2[1:]
      elif not l2:
        nums.append(nums1[0])
        nums1 = nums1[1:]
      elif nums1[0] < nums2[0]:
        nums.append(nums1[0])
        nums1 = nums1[1:]
      else:
        nums.append(nums2[0])
        nums2 = nums2[1:]
      l1 = len(nums1)
      l2 = len(nums2)

    if isEven:
      return (nums[i_m - 1] + nums[i_m]) / 2
    else:
      return nums[i_m]
  

if __name__ == '__main__':
  s = Solution()
  print(s.findMedianSortedArrays([1,3], [2]))
  print(s.findMedianSortedArrays([1,2], [3,4]))
  print(s.findMedianSortedArrays([], [3]))
  print(s.findMedianSortedArrays([], [3,4]))