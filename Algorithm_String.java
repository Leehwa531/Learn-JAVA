public class Algorithm_String {
  public static void main(String[] args) {
      String str = "apple";
      
      // 길이 반환
      str.length();

      // 빈 문자열 체크
      str.isEmpty();

      // 문자 찾기
      str.charAt(0);        // 첫 번째 문자 반환
      str.indexOf("a");     // 첫 번째 "a"의 인덱스 반환
      str.lastIndexOf("p"); // 마지막 "p"의 인덱스 반환

      // 문자 자르기
      str.substring(1, 3);  // 인덱스 1부터 3 이전까지 반환
      str.substring(3);     // 인덱스 3부터 끝까지 반환

      // 문자 치환(바꾸기)
      str.replace('p', 'e');      // 모든 "p"를 "e"로 치환
      str.replaceAll(".", "/");   // 모든 문자를 "/"로 치환
      str.replaceFirst("p", "e"); // 첫 번째 "p"만 "e"로 치환

      // 문자 동일 여부 판단
      str.equals("apple");

      // 문자 비교
      str.compareTo("applp"); // 사전순 비교

      // 문자 포함 여부 판단
      str.contains("app");

      // 문자열 분리
      str.split("");  // 한 글자씩 분리하여 배열 반환
      str.split(" "); // 공백 기준으로 분리하여 배열 반환

      // 문자 앞뒤 공백 제거
      str.trim();

      // 문자 <-> 숫자 변환
      Integer.parseInt("100"); // 문자열 "100"을 숫자 100으로 변환
      Integer.toString(100);   // 숫자 100을 문자열 "100"으로 변환
  }
}
