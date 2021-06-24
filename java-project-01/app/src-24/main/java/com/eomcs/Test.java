package com.eomcs;

public class Test {
  static class X {
    int a;
  }

  static class Y {
    int b;
  }

  public static void main(String[] args) {
    X obj1 = new X();
    Y obj2 = new Y();

    //X obj3 = new Y();
    //Y obj4 = new X();

    Object obj5;
    //obj5 = new X();
    obj5 = new Y();

    Y obj6 = (Y) obj5;

    obj6.b = 100;

    System.out.println(obj6.b);

  }

}
