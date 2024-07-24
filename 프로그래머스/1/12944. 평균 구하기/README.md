# [level 1] 평균 구하기 - 12944 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12944) 

### 성능 요약

메모리: 75.6 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 07월 23일 22:43:12

### 문제 설명

<p>정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.</p>

<h4>제한사항</h4>

<ul>
<li>arr은 길이 1 이상, 100 이하인 배열입니다.</li>
<li>arr의 원소는  -10,000 이상 10,000 이하인 정수입니다.</li>
</ul>

<h4>입출력 예</h4>
<table class="table">
        <thead><tr>
<th>arr</th>
<th style="text-align: center">return</th>
</tr>
</thead>
        <tbody><tr>
<td>[1,2,3,4]</td>
<td style="text-align: center">2.5</td>
</tr>
<tr>
<td>[5,5]</td>
<td style="text-align: center">5</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

- 오늘의 회고
> - 어떤 문제가 있었는지
  ![에러 1](https://github.com/user-attachments/assets/e549429c-f5e9-4928-bcb8-4acad581ae4b)

배열의 길이를 확인하는데 size()와 length를 헷갈렸다.
  
  
  ---
  - 어떻게 해결했는지
  ![해결](https://github.com/user-attachments/assets/17563242-687b-430c-bddd-7fdbc2669c1c)

배열을 순회시켜 모든 값을 더하고 해당 배열의 길이만큼 나누어 평균값을 계산했다.

  ---
  - 무엇을 새롭게 알았는지
   오늘도 한줄 만에 정리되는 코드를 발견했는데 stream으로 코드를 단축하는데 정말 용이한 것 같다.
        return Arrays.stream(arr).average().getAsDouble();
    }
    
  --- 
  
  - 내일 학습할 것은 무엇인지
  	Stream에 대해 복습하기
