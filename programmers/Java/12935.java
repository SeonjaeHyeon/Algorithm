/*
https://programmers.co.kr/learn/courses/30/lessons/12935
연습문제
제일 작은 수 제거하기

[문제설명]
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

[제한조건]
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
*/

import java.util.Arrays;

// Enhanced for문, for문, continue문, < 연산자, 배열 인덱싱 사용 (더 빠른 풀이)
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int i = 0;
        for (int n: arr) {
            if (n == min) {
                continue;
            }

            answer[i++] = n;
        }

        return answer;
    }
}

// Arrays.stream(), IntStream.min(), OptionalInt.getAsInt(), IntStream.filter(), IntStream.toArray() 사용 (람다식 풀이)
class Solution2 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
