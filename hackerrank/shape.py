t = int(input())
for _ in range(t):
    shape = input().lower()
    a = int(input())
    b = int(input())
    if shape == "rectangle" and a == b:
        print(a*b)
    elif shape == "square":
        print(int((a*b)/2))
    elif shape == "triangle" :
        print(a*b)
    else:
        print("0")
        
    