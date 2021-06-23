package com.eomcs;


public class Test2 {

  static class A {
    int x;
  }
  static class B {
    int y;
  }
  static class C {
    int z;
  }

  public static void main(String[] args) {
    A r1 = new A();
    r1.x = 100;

    Object obj = new A();
    //obj.x = 100; // x에는 실제 A의 인스턴스 주소가 저장된 것이 맞지만,
    // 컴파일러 입장에서는 obj 변수의 클래스를 가지고 변수를 찾기 때문에 
    // 컴파일 오류가 발생한다.

    // obj에 들어 있는 인스턴스 주소를 제대로 사용하려면 
    // 원래의 타입으로 형변환 한 다음에 사용하라.
    A r2 = (A) obj;
    r2.x = 100; // OK!

    B r3 = (B) obj; // 컴파일러는 속일 수 있지만, 실행할 때 JVM에서 예외가 발생할 것이다.
    r3.y = 200;

    System.out.println("종료!");
  }
}






