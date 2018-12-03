#!/usr/local/bin/python3

class Solution:
  def convert(self, s, numRows):
    """
    :type s: str
    :type numRows: int
    :rtype: str
    """
    if numRows == 1:
      return s
    strs = []
    for i in range(numRows):
      strs.append('')
    step = 1
    index = 0 # s's index
    i = 0 # row's index
    length = len(s)
    while index < length:
      strs[i] += s[index]
      index += 1
      i += step
      if i == numRows - 1:
        step = -1
      if i == 0:
        step = 1
    return ''.join(strs)

if __name__ == '__main__':
  s = Solution()
  print(s.convert('PAYPALISHIRING',3) == 'PAHNAPLSIIGYIR')
  print(s.convert('PAYPALISHIRING',4) == 'PINALSIGYAHRPI')