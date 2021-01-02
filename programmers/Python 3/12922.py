'''
https://programmers.co.kr/learn/courses/30/lessons/12922
연습문제
수박수박수박수박수박수?

[문제설명]
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

[제한사항]
n은 길이 10,000이하인 자연수입니다.
'''

# List comprehension, str.join(), range(), 삼항 연산자 사용
def solution(n):
    return ''.join(["박" if x % 2 else "수" for x in range(n)])

# List comprehension, str.join(), range(), 리스트 인덱싱 사용
def solution2(n):
    return ''.join([["수", "박"][x % 2] for x in range(n)])

# List comprehension, str.join(), range(), 문자열 인덱싱 사용
def solution3(n):
    return ''.join(["수박"[x % 2] for x in range(n)])

# 문자열 * 연산자, 삼항 연산자, 문자열 슬라이싱 사용 (더 빠른 풀이)
def solution4(n):
    return ("수박" * ((n + 1 if n % 2 else n) // 2))[0:n]
