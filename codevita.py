n1,n2=input().split(" ")
n1=int(n1)
n2=int(n2)
def prime(n1,n2):
    l=[]
    for i in range(n1,n2+1):
        if(isprime(i)):
            l.append(i)
    return l

def combination(l):
    combineset=[]
    for i in range(len(l)):
        for j in range(len(l)):
            if(l[i]!=l[j]):
                combine=int(str(l[i])+str(l[j]))
                if(isprime(combine)):
                        combineset.append(combine)
    combineset=list(set(combineset))
    print(len(combineset))                       
                            
                

def isprime(n):
    #i=2;
    if(n%2==0):
        return False
    if(n<2):
        return False
    i=2
    while(i*i<=n):
        if(n%i==0):
            return False
        i+=1
    return True
l=prime(2,40)
combination(l)

