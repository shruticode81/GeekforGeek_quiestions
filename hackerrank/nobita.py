def problem(si,ei,li,string):
    mystr=string[si:ei+1]
    if len(li)==0 or len(li[-1])<len(mystr):
        li.append(mystr)
    else:
        return
    num=ei-si
    problem(ei+1,ei+num+1,li,string)
    
    

n=int(input())
i=0
while i<n:
    string=input()
    li=[]
    problem(0,0,li,string)
    for ele in li:
        if len(ele)==1:
            print(ele,end="")
        else:
            print(ele[0],end="")
            print(ele[-1],end="") 