package com.eomcs;

class X {
  static int c;
  static void z() {
    System.out.println("X.z()");
  }
}

public class Test {

  static int b; // .class 파일이 메모리에 로딩될 때 만들어지는 변수 => 클래스 변수 = 스태틱 변수 

  static void m() {
    System.out.println("m()");
  }

  public static void main(String[] args) {
    int a; // 메서드가 호출될 때 만들어지는 변수 => 로컬 변수

    a = 100;
    b = 200;
    m();

    X.c = 300;
    X.z();
  }

}
