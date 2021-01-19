'''
https://programmers.co.kr/learn/courses/30/lessons/68935
월간 코드 챌린지 시즌 1
3진법 뒤집기

[문제설명]
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

[제한사항]
n은 1 이상 100,000,000 이하인 자연수입니다.
'''

# divmod() 메소드는 몫과 나머지를 튜플로 반환한다.
# reversed() 메소드는 sorted() 메소드와 달리 이터레이터를 반환한다.
def base3(num):
    NOTATION = '012'

    q, r = divmod(num, 3)
    n = NOTATION[r]
    return base3(q) + n if q else n

def solution(n):
    return int(''.join(reversed(base3(n))), 3)
