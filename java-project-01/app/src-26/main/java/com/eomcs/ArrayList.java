package com.eomcs;

public class ArrayList {

  // 배열의 최대 크기를 지정하는 변수는 모든 인스턴스가 같다.
  // => 따라서 각 인스턴스 마다 이 변수를 가질 필요는 없다.
  // => 그러니 이 변수는 그냥 클래스 변수로 둔다.
  // => 보통 상수 변수(final 변수)는 클래스 변수(스태틱 변수)로 선언한다. 
  static final int MAX_LENGTH = 100;

  // 각 인스턴스 마다 개별적으로 관리해야 하는 변수는 인스턴스 변수로 선언한다.
  Object[] list = new Object[MAX_LENGTH];
  int size = 0;

  // 메서드가 작업할 때 인스턴스 변수를 사용할 수 있도록 파라미터로 인스턴스 주소를 전달한다.
  static void append(ArrayList that, Object obj) {
    that.list[that.size++] = obj;
  }

  static Object[] toArray(ArrayList that) {
    Object[] arr = new Object[that.size];
    for (int i = 0; i < that.size; i++) {
      arr[i] = that.list[i];
    }
    return arr;
  }

  static Object retrieve(ArrayList that, int index) {
    return that.list[index];
  }

  static void remove(ArrayList that, int index) {
    for (int i = index; i < that.size - 1; i++) {
      that.list[i] = that.list[i + 1];
    }
    that.size--;
  }

}






