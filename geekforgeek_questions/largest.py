l=[12,5,787,1,23]
k=int(input())
##find 2 largest elements from the array
for i in range(k):
    maximum=max(l)
    print(maximum,end=' ')
    l.remove(maximum)