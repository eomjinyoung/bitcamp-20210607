package com.eomcs;

import java.util.Scanner;

public class MemberHandler {

  static Scanner keyScan;

  static void service() {
    loop: while (true) {
      System.out.print("회원 관리> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": break;
        case "add": break;
        case "update": break;
        case "delete": break;
        case "view": break;
        case "back":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();
    }
  }
}
