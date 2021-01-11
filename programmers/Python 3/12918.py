'''
https://programmers.co.kr/learn/courses/30/lessons/12918
연습문제
문자열 다루기 기본

[문제설명]
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

[제한사항]
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
'''

# str.isdigit(), len(), and 연산자, in 연산자 사용
def solution(s):
    return s.isdigit() and len(s) in (4, 6)

# re.match(), bool() 사용 (정규식 풀이)
def solution2(s):
    import re
    return bool(re.match(r"^(\d{4}|\d{6})$", s))
