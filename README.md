# Java-Basic
## W1
- ### Input Style
    > #### Scanner
    >```java
    >    Scanner sc = new Scanner(System.in);
    >    String A = sc.next(); // 빈문자열, 개행 구분
    >    String B = sc.nextLine(); // 개행 구분
    >```

    > #### BufferdReader
    >```java
    >    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    >    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    >
    >    String n1 = st.nextToken();
    >    String n2 = st.nextToken();
    >```
    - [Scanner, BufferReader, InputStreamReader, StringTokenizer](https://velog.io/@naneun/Java-IO-InputStream-OutputStream-Reader-Writer)
---

- ### [분산처리 (B3)](https://www.acmicpc.net/problem/1009)
  - [Code Link](https://github.com/naneun/Java-Practice/blob/main/src/1009.java)
    > - 단순 규칙
---
- ### [저항 (B2)](https://www.acmicpc.net/problem/1076)
  - [Code Link](https://github.com/naneun/Java-Practice/blob/main/src/1076.java)
    > - Map 초기값 설정
    >  1. Map<String, Integer> mp = new HashMap<>() {{ put(key, value); }};
    >  2. Map<String, Integer> COLOR_MAP = Map.of(key1, val1, key2, val2, ...);
---
- ### [물병 (S1)](https://www.acmicpc.net/problem/1052)
  - [Code Link (Version1)](https://github.com/naneun/Java-Practice/blob/main/src/1052.java)
  - [Code Link (Version2)](https://github.com/naneun/Java-Practice/blob/main/src/1052%20-%202.java)
    > - 그리디, 비트연산
---
- ### [큰 수 A+B (B5)](https://www.acmicpc.net/problem/10757)
  - [Code Link (Version1)](https://github.com/naneun/Java-Practice/blob/main/src/10757.java)
  - [Code Link (Version2)](https://github.com/naneun/Java-Practice/blob/main/src/10757%20-%202.java)
    > - Arrays.fill(dest, val) - 배열 채우기
    > - System.arraycopy(src, srcPos, dest, destPos, length) - 배열 복사
    
    > #### StringBuffer
    > - new StringBuffer(str).reverse() - 문자열 역정렬
    > - String.toCharArray() - String -> Char 배열 변환
    > - List.stream()
        .map(Object::toString)
        .collect(Collectors.joining(str)) - List 요소들을 이어 붙여 문자열로 변환

    > #### StringBuilder
    > - StringBuilder sb = new StringBuilder() - StringBuilder 할당
    > - sb.append(Object) - 매개변수를 char[]로 변환하여 append
    > - sb.reverse() - char[] 을 역정렬
  - [StringBuffer vs StringBuilder](https://velog.io/@naneun/Java-StringBuffer-vs-StringBuilder)
---
## W2
- ### [Reverse Integer](https://leetcode.com/problems/reverse-integer/)
  - [Code Link](https://github.com/naneun/Java-Basic/blob/main/src/W2/ReverseInteger.java)
    > - str.substring(beginIndex);
    > - str.substring(beginIndex, endIndex);
---
- ### [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
  - [Code Link](https://github.com/naneun/Java-Basic/blob/main/src/W2/RemoveDuplicatesfromSortedList.java)
    > - LinkedList
---
- ### [Remove Duplicates From an Unsorted Linked List](https://leetcode.com/problems/remove-duplicates-from-an-unsorted-linked-list/)
  - [Code Link](https://github.com/naneun/Java-Basic/blob/main/src/W2/RemoveDuplicatesFromanUnsortedLinkedList.java)
    > - Set, add, contains
---
- ### [Palindrome Number](https://leetcode.com/problems/palindrome-number/)
  - [Code Link](https://github.com/naneun/Java-Basic/blob/main/src/W2/PalindromeNumber.java)
    > - new StringBuilder(String str)
    >```java
    >new StringBuilder(Integer.toString(num))
    >```    
---
- ### [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)  
  - [Code Link](https://github.com/naneun/Java-Basic/blob/main/src/W2/LongestCommonPrefix.java)
    >```java
    >// 문자열 길이를 기준으로 오름차 순 정렬
    >
    >Arrays.sort(strs, (s1, s2) -> {
    >  return Integer.compare(s1.length(), s2.length());
    >});
    >```
- ### [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
  - [Code Link](https://github.com/naneun/Java-Basic/blob/main/src/W2/LinkedListCycle.java)
    > - LinkedList
---