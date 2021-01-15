/*
https://programmers.co.kr/learn/courses/30/lessons/12937
연습문제
짝수와 홀수

[문제설명]
정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

[제한조건]
num은 int 범위의 정수입니다.
0은 짝수입니다.
*/

class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
