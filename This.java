public class This {
  // 인스턴스 변수
  private String name;

  // 생성자
  public This(String name) {
      // this를 사용해서 인스턴스 변수와 매개변수를 구분
      this.name = name;
  }

  // 메서드
  public void printName() {
      System.out.println("Name: " + this.name);
  }

  public static void main(String[] args) {
      This obj = new This("Yerim");
      obj.printName();
  }
}
