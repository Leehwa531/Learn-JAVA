public class Static {
  // static 변수
  static int count = 0;

  // 인스턴스 변수
  int instanceValue = 0;

  // static 메서드
  static void showCount() {
      System.out.println("Count: " + count);
  }

  // 인스턴스 메서드
  void incrementValues() {
      count++;          // static 변수에 접근 가능
      instanceValue++;  // 인스턴스 변수 변경
  }

  public static void main(String[] args) {
      // static 변수와 메서드는 객체 생성 없이 클래스 이름으로 접근 가능
      Static.showCount(); // 출력: Count: 0
    
      // 객체 생성
      Static obj1 = new Static();
      Static obj2 = new Static();

      // 인스턴스 메서드 호출
      obj1.incrementValues();
      obj2.incrementValues();

      // static 변수는 모든 객체가 공유
      Static.showCount(); // 출력: Count: 2

      // 각 객체의 인스턴스 변수는 독립적
      System.out.println("obj1 instanceValue: " + obj1.instanceValue); // 출력: 1
      System.out.println("obj2 instanceValue: " + obj2.instanceValue); // 출력: 1
  }
}
