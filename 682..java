class Solution(object):
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """
        score=[]
        j=0
        for i in ops:
            if ( i == "D"):
                score.append(2*score[j-1])
                j+=1
            elif (i == "C"):
                score.pop(j-1)
                j-=1
            elif(i == "+"):
                score.append(score[j-1]+score[j-2])
                j+=1
            else:
                score.append(int(i))
                j+=1
        return sum(score)
            
                
        