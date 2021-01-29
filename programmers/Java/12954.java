/*
https://programmers.co.kr/learn/courses/30/lessons/12954
연습문제
x만큼 간격이 있는 n개의 숫자

[문제설명]
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

[제한조건]
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
*/

// for문, 배열 인덱싱, 타입 캐스팅 사용
// x * i는 int 범위 내에서 오버플로우가 생길 수 있으므로 x를 long 자료형으로 강제 캐스팅 해준다.
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x + (long) x * i;
        }

        return answer;
    }
}

// for문, 배열 인덱싱 사용
// answer[i - 1]이 long 자료형이므로 x도 long 자료형으로 자동 캐스팅 된다.
class Solution2 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}
