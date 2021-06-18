package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test0111 {

  static void 공백출력해라(int 공백길이) {
    int 카운트 = 1;
    while (카운트 <= 공백길이) {
      System.out.print(" ");
      카운트++;
    }
  }

  static void 별출력해라(int 별개수) {
    int 카운트 = 1;
    while (카운트 <= 별개수) {
      System.out.print("*");
      카운트++;
    }
  }

  static int 공백개수는(int 총개수, int 별개수) {
    return (총개수 - 별개수) / 2;
  }

  static int 총개수는() {
    Scanner 키보드입력기 = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int 총개수 = 키보드입력기.nextInt();
    키보드입력기.close();
    return 총개수;
  }

  public static void main(String[] args) {
    int 총개수 = 총개수는();

    for (int 별개수 = 1; 별개수 <= 총개수; 별개수 += 2) {
      공백출력해라(공백개수는(총개수, 별개수));
      별출력해라(별개수);
      System.out.println();
    }
  }
}