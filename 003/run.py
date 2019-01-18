#!/usr/local/bin/python3

class Solution:
  def lengthOfLongestSubstring(self, s):
    # max, l, r
    length = len(s)
    m = 0
    l = 0
    r = 0
    while r <= length:
      ss = s[l:r]
      if self.isValid(ss):
        m = max(len(ss), m)
        r += 1
      else:
        l += 1
        r += 1
    return m

  def isValid(self, s):
    return len(set(s)) == len(s)


if __name__ == '__main__':
  s = Solution()
  print(s.lengthOfLongestSubstring('abcabcbb'))
  print(s.lengthOfLongestSubstring('bbbbb'))
  print(s.lengthOfLongestSubstring('pwwkew'))
