n= int(input())
x=[ int(i) for i in input().split()[:n]]
#print(x)
x=list(set(x))
print(min(x))
