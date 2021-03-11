# n= int(input())
# l =[int(i) for i in input().split()[:n] ]
# print(n)
# print(l)
def func(l):
    #if(n>=3):
    n=l[0]
    l=l[1:]

        #l=list(args)
    if n>=3 :
        for i in range(1,n-1):
            if l[i]== -1:
                if((l[i-1]%2==0 and l[i+1]%2==0)or(l[i-1]%2!=0 and l[i+1]%2!=0)):
                    l[i]=abs(l[i-1]-l[i+1])
                else:
                    l[i]= int((l[i-1]+l[i+1])/2)
        #print(l)
        for i in range(n-1):
            if l[i]!=1 :
                l[i]=l[i]-1
        print("".join([str(l[i]) for i in range(n)]))

t = int(input())
for _ in range(t):
   # n=int(input())
    l = [int(i) for i in input().split()]
    func(l)