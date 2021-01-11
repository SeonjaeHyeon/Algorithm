'''
https://programmers.co.kr/learn/courses/30/lessons/12906
연습문제
같은 숫자는 싫어

[문제설명]
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

[제한사항]
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
'''

# List comprehension, enumerate(), 리스트 인덱싱 사용
def solution(arr):
    return [v for i, v in enumerate(arr) if not i or v != arr[i - 1]]

# list.append(), 리스트 슬라이싱 사용
def solution2(arr):
    answer = []
    add = answer.append  # 파이썬에서 .을 사용하면 속도가 저하되는 현상이 있다. 따라서 함수로 선언해서 사용한다.

    for v in arr:
        if v in answer[-1:]:  # 빈 리스트일 때 [-1]은 에러가 발생하지만, [-1:]은 빈 리스트를 반환한다.
            continue
        add(v)

    return answer
