package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler implements Handler {

  // 사용자 정의 데이터 타입
  // => 도메인 객체(domain object)
  // => 값 객체(value object; VO)
  // => 데이터 전송 객체(Data Transfer Object; DTO)
  // => 모델 객체(model)
  // 
  static class Member {
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  static Scanner keyScan;

  public void execute() {
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
