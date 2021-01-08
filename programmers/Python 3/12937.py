'''
https://programmers.co.kr/learn/courses/30/lessons/12937
연습문제
짝수와 홀수

[문제설명]
정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

[제한조건]
num은 int 범위의 정수입니다.
0은 짝수입니다.
'''

# % 연산자, 삼항연산자 사용
def solution(num):
    return "Odd" if num % 2 else "Even"

# % 연산자, 튜플 인덱싱 사용
def solution2(num):
    return ("Even", "Odd")[num % 2]

# & 연산자, 삼항연산자 사용 (비트 연산)
# 홀수는 2^0 자릿수가 1이므로 숫자 1과 AND 연산을 하면 결과가 1이 나온다.
def solution3(num):
    return "Odd" if num & 1 else "Even"

# % 연산자, and 연산자, or 연산자 사용
# and, or을 나열하는 것보다는 삼항연산자를 사용하는 것이 더 낫다.
def solution4(num):
    return num % 2 and "Odd" or "Even"