a=int(input())
b=int(input())
temp=0
while(b!=0):
    temp=b
    b=a%b
    a=temp
print(a)

2 