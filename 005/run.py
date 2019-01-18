#!/usr/local/bin/python3

class Solution:
  def longestPalindrome(self, s):
    for i in range(len(s)):
      l = len(s) - i
      result = self.findPaliInLen(s, l)
      if result:
        return result
  

  def findPaliInLen(self, s, l):
    for i in range(len(s) - l + 1):
      r = i + l
      if self.isPali(s[i:r]):
        return s[i:r]
    return ''


  def isPali(self, s):
    length = len(s)
    i = int(length / 2)
    r = i if length % 2 == 0 else i + 1
    if length == 1:
      return True
    if length == 2 and s[0] == s[1]:
      return True
    return s[:i] == s[r:][::-1]


if __name__ == '__main__':
  s = Solution()
  print(s.longestPalindrome('babad'))
  print(s.longestPalindrome('cbbd'))
  print(s.longestPalindrome('a'))
  print(s.longestPalindrome('bb'))
  print(s.longestPalindrome('ccc'))
  print(s.longestPalindrome('abb'))
  print(s.longestPalindrome('aaaa'))
  print(s.isPali('aaaa'))