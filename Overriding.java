
  class Pet {
    void bark() {
      System.out.println("pipi");
      }
    }
  class Dog extends Pet {
    void bark() {
      System.out.println("왈왈!");
    }
  }

  class Cat extends Pet {
    void bark() {
      System.out.println("야옹야옹!");
    }
  }

  public class Overriding {
  public static void main(String[] args) {
    Pet pet = new Dog();
    pet.bark();
  }
}
