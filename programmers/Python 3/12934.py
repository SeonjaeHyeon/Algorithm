'''
https://programmers.co.kr/learn/courses/30/lessons/12934
연습문제
정수 제곱근 판별

[문제설명]
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

[제한사항]
n은 1이상, 50000000000000 이하인 양의 정수입니다.
'''

# for문, range(), == 연산자, > 연산자, ** 연산자 사용
def solution(n):
    for i in range(1, n + 1):
        num = i ** 2

        if num == n:
            return (i + 1) ** 2

        if num > n:
            return -1

# % 연산자, == 연산자, ** 연산자 사용
# ** 연산자 또는 pow() 메소드는 지수가 실수인 경우에도 계산할 수 있다.
def solution2(n):
    num = n ** (.5)

    if num % 1 == 0:
        return (num + 1) ** 2

    return -1

# int(), == 연산자, ** 연산자, and 연산자, or 연산자 사용
def solution3(n):
    return n == int(n ** .5) ** 2 and int(n ** .5 + 1) ** 2 or -1

# int(), == 연산자, ** 연산자, 삼항연산자 사용
def solution4(n):
    return int(n ** .5 + 1) ** 2 if n == int(n ** .5) ** 2 else -1
