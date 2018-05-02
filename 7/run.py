class Solution:
  def reverse(self, x):
    U = 2147483647
    D = -2147483648
    y = ''.join(reversed(str(x)))
    if y[-1] == '-':
      y = '-' + y[:-1]
    z = int(y)
    if z > U or z < D:
      z = 0
    return z

if __name__ == '__main__':
  s = Solution()
  assert s.reverse(123) == 321
  assert s.reverse(-123) == -321
  assert s.reverse(120) == 21
  assert s.reverse(1534236469) == 0
