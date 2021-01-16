'''
https://programmers.co.kr/learn/courses/30/lessons/70128
월간 코드 챌린지 시즌 1
내적

[문제설명]
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

[제한사항]
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
'''

# List comprehension, sum(), range(), len(), 리스트 인덱싱 사용
def solution(a, b):
    return sum([a[i] * b[i] for i in range(len(a))])

# List comprehension, sum(), enumerate(), 리스트 인덱싱 사용
def solution2(a, b):
    return sum([k * b[i] for i, k in enumerate(a)])

# Generator expressions, sum(), zip() 사용
# sum()과 같은 메소드에서는 List comprehension 대신 Generator expressions를 사용할 수 있다.
def solution3(a, b):
    return sum(x * y for x, y in zip(a, b))
