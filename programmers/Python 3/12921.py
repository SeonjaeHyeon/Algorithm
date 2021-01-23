'''
https://programmers.co.kr/learn/courses/30/lessons/12921
연습문제
소수 찾기

[문제설명]
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

[제한조건]
n은 2이상 1000000이하의 자연수입니다.
'''

'''
※ 효율성 통과를 위해서는 에라토스테네스의 체를 이용하여야 한다.
https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4
'''

# List comprehension, for문, int(), range(), len(), * 연산자, = 연산자, ** 연산자, 리스트 사용 (더 빠른 풀이)
def solution(n):
    prime = [True] * (n + 1)
    m = int(n ** .5)

    for i in range(2, m + 1):
        if prime[i]:
            for j in range(i + i, n + 1, i):
                prime[j] = False

    return len([x for x in range(2, n + 1) if prime[x]])

# for문, range(), int(), len(), ** 연산자, -= 연산자, 집합 사용
def solution2(n):
    num=set(range(2,n+1))

    for i in range(2,int(n**.5)+1):
        if i in num:
            num-=set(range(i+i,n+1,i))

    return len(num)
