a = {6,5,3,2}
b = {6,1,2,3}
c = list(a.union(b))
d = len(c) #6,2,3

for i in range (0, len(c)):
     d += (c[i] + 10) # {6,2,3} + 10 = 22  ===> for each array ==> (6+2+3+10)

print (d + len(c)) # 22 + for length of C {6,2,3} = 28 + 24 + 25 = 77 ===> check the bracket
