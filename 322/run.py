class Solution:
  def __init__(self):
    self.table = {}

  def coinChange(self, coins, amount):
      """
      :type coins: List[int]
      :type amount: int
      :rtype: int
      """
      if amount in self.table.keys():
        return self.table[amount]
      if amount == 0:
        return 0
      if amount in coins:
        return 1
      count = None
      has_init = False
      for coin in coins:
        left = amount - coin
        if left > 0:
          c = self.coinChange(coins, amount - coin)
          if c != -1:
            c = c + 1
            if has_init:
              count = min(count, c)
            else:
              count = c
              has_init = True
      if not has_init:
        count = -1
      self.table[amount] = count
      return count

if __name__ == '__main__':
  s = Solution()
  print(s.coinChange([1,2,5],11))
  print(s.coinChange([1],0))
  print(s.coinChange([1,2,5],100))
  print(s.coinChange([342,268,284,65,217,461,245,249,106],9278))
  print(s.coinChange([368,305,204,88,148,423,296,125,346],7163))