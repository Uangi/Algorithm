![메모리증가](https://github.com/user-attachments/assets/dccae414-c0f5-45b4-a16a-860f11a88940)# [level 1] 문자열 내 p와 y의 개수 - 12916 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12916#) 

### 성능 요약

메모리: 73.8 MB, 시간: 0.07 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 07월 25일 20:05:21

### 문제 설명

<p>대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.</p>

<p>예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.</p>

<h5>제한사항</h5>

<ul>
<li>문자열 s의 길이 : 50 이하의 자연수</li>
<li>문자열 s는 알파벳으로만 이루어져 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th>answer</th>
</tr>
</thead>
        <tbody><tr>
<td>"pPoooyY"</td>
<td>true</td>
</tr>
<tr>
<td>"Pyy"</td>
<td>false</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1<br>
'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.</p>

<p>입출력 예 #2<br>
'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.</p>

<p>※ 공지 - 2021년 8월 23일 테스트케이스가 추가되었습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
> ---
## 오늘의 회고
> - 어떤 문제가 있었는지<br/>
  ![에러 확인](https://github.com/user-attachments/assets/5890f661-6c33-48b6-9326-abc665c0cea3)
분명 테스트를 전부 통과했지만 채점 시 반은 실패하고 반은 성공해서 다시 풀게되었다.

  ---
>  - 어떻게 해결했는지<br/>
  ![찐성공](https://github.com/user-attachments/assets/4ce2dd3b-0b6d-4c9d-b6a7-be03d6579034)

코드를 처음부터 확인해보니 String s를 대문자로 변환해서 str에 대입해놓고 정작 문자 배열로 바꿀땐 str.toCharArray()가 아닌 s.toCharArray()로 사용하고있었다.


  ---
  - 무엇을 새롭게 알았는지<br/>
        레벨이 낮은 알고리즘 문제는 웬만하면 거의 한 줄로 정리되는 것 같다.
    그러나 count 측정 시 for문이나 정규식으로 하는 것보다 훨씬 느리다고 하는데 꼭 간결함만이 답은 아닌 것 같다.<br/>
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();

    그리고 변수를 하나로 사용해서 해결하는 방법이 있었는데 오히려 메모리 사용량이 늘어났다. 어디서 사용량이 늘어났는지 확인해야겠다.
    ![메모리증가](https://github.com/user-attachments/assets/02ff3912-16a3-4e35-82d7-9a440bb540e8)

  --- 
