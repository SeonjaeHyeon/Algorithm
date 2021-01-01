'''
https://programmers.co.kr/learn/courses/30/lessons/12919
연습문제
서울에서 김서방 찾기

[문제설명]
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

[제한사항]
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
Kim은 반드시 seoul 안에 포함되어 있습니다.
'''

# f-string 사용
def solution(seoul):
    return f"김서방은 {seoul.index('Kim')}에 있다"

# str.format 사용
def solution2(seoul):
    return "김서방은 {}에 있다".format(seoul.index("Kim"))

# printf 스타일 사용
def solution3(seoul):
    return "김서방은 %d에 있다" % seoul.index("Kim")

# for문, enumerate() 사용
def solution4(seoul):
    for i, j in enumerate(seoul):
        if j == "Kim":
            return f"김서방은 {i}에 있다"

# for문, range(), len() 사용
def solution5(seoul):
    for i in range(len(seoul)):
        if seoul[i] == "Kim":
            return f"김서방은 {i}에 있다"
