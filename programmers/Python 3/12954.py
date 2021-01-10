'''
https://programmers.co.kr/learn/courses/30/lessons/12954
연습문제
x만큼 간격이 있는 n개의 숫자

[문제설명]
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

[제한조건]
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
'''

# list(), range(), 삼항연산자 사용
def solution(x, n):
    return list(range(x, x * (n + 1), x)) if x else [0] * n

# List comprehension, range() 사용
def solution2(x, n):
    return [i * x + x for i in range(n)]

# List comprehension, range() 사용
def solution3(x, n):
    return [x * i for i in range(1, n + 1)]
