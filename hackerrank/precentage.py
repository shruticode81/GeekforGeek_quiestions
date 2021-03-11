n = int(input())
student_marks={}
for _ in range(n):
    name, *line = input().split()
    scores = list(map(float, line))
    student_marks[name] = scores
query_name = input()
l=student_marks[query_name]
#print(l)
avg=sum(l)/3
print(format(avg, '.2f'))