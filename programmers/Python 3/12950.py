'''
https://programmers.co.kr/learn/courses/30/lessons/12950
연습문제
행렬의 덧셈

[문제설명]
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

[제한조건]
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
'''

# List comprehension, zip(), + 연산자 사용
def solution(arr1, arr2):
    return [[c + d for c, d in zip(a, b)] for a, b in zip(arr1, arr2)]

# List comprehension, list(), map(), sum(), zip(), * 연산자 사용
# zip() 메소드 안의 * 연산자는 리스트를 unzip 한다.
def solution2(arr1, arr2):
    return [list(map(sum, zip(*x))) for x in zip(arr1, arr2)]
