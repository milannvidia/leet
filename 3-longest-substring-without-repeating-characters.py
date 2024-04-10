class Solution(object):
    def lengthOfLongestSubstring(self, s):
        if len(s) == 0:
            return 0
 
        if len(s) == 1:
            return 1
        
        maxLength = 0
        visited = [False] * 256
 
        left, right = 0, 0
        while right < len(s):
 
            if visited[ord(s[right])]:
                while visited[ord(s[right])]:
    
                    visited[ord(s[left])] = False
                    left += 1

            visited[ord(s[right])] = True
            maxLength = max(maxLength, right - left + 1)
            right += 1
 
        return maxLength

        