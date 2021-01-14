'''
https://programmers.co.kr/learn/courses/30/lessons/12928
연습문제
약수의 합

[문제설명]
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

[제한사항]
n은 0 이상 3000이하인 정수입니다.
'''

# List comprehension, for문, sum(), range(), % 연산자 사용
def solution(n):
    return sum([x for x in range(1, n + 1) if not n % x])

# List comprehension, for문, sum(), range(), % 연산자, // 연산자 사용 (더 빠른 풀이)
# n // 2인 수까지만 확인하므로 효율성이 향상된다. 그 이후의 수 중에서 n의 약수는 n 자신밖에 없다.
def solution2(n):
    return n + sum([i for i in range(1, (n // 2) + 1) if n % i == 0])

# sum(), filter(), range(), % 연산자 사용 (람다식 풀이)
def solution3(n):
    return sum(filter(lambda x: n % x == 0, range(1, n + 1)))
