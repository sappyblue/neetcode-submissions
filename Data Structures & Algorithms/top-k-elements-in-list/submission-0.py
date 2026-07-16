class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        for i in nums:
            freq[i]=freq.get(i,0)+1
        
        result =[]
        sorted_elements = sorted(freq, key=lambda x: freq[x], reverse=True)

        for n in range(k):
            if n>= len(sorted_elements):
                break
            elements= sorted_elements[n]
            result.append(elements)
        
        return result
