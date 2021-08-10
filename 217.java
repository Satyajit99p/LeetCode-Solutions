import numpy as np
class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        x=np.array(nums)
        x=np.unique(x)
        return not(len(nums)==len(x))