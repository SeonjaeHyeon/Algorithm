'''
https://programmers.co.kr/learn/courses/30/lessons/42577
해시
전화번호 목록

[문제설명]
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

[제한사항]
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
'''

# 리스트와 sort() 사용
def solution(phone_book):
    answer = True

    phone_book.sort()

    for _ in range(len(phone_book) - 1):
        num = phone_book[0]
        del phone_book[0]

        for i in phone_book:
            if i.startswith(num):
                return False

    return answer

# 딕셔너리 사용 (해시 풀이)
def solution2(phone_book):
    answer = True

    data = {x:1 for x in phone_book}
    for i in data:
        for j in data:
            if i != j and i.startswith(j):
                return False

    return answer
