from typing import List
import heapq
from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        # Step 1: Count frequency
        freq = Counter(nums)
        
        # Step 2: Min-heap of size k
        min_heap = []
        for num, count in freq.items():
            heapq.heappush(min_heap, (count, num))
            if len(min_heap) > k:
                heapq.heappop(min_heap)
        
        # Step 3: Extract result
        return [num for count, num in min_heap]
