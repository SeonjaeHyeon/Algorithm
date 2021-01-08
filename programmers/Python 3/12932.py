'''
https://programmers.co.kr/learn/courses/30/lessons/12932
연습문제
자연수 뒤집어 배열로 만들기

[문제설명]
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

[제한조건]
n은 10,000,000,000이하인 자연수입니다.
'''

# list(), map(), reversed(), str() 사용
def solution(n):
    return list(map(int, reversed(str(n))))

# list(), map(), list(), str(), 문자열 슬라이싱 사용
def solution2(n):
    return list(map(int, list(str(n)[::-1])))

# List comprehension, int(), str(), 문자열 슬라이싱 사용
def solution3(n):
    return [int(x) for x in str(n)[::-1]]
