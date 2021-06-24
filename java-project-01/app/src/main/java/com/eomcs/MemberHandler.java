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

  static void add() {
    System.out.println("[회원 등록]");

    if (ArrayList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더이상 회원을 추가할 수 없습니다.");
      return;
    }

    // 한 개의 회원 데이터를 저장할 변수를 준비한다.
    // => Member 설계도에 따라 변수를 만들고 그 주소를 리턴한다.
    Member member = new Member(); 

    System.out.print("이름: ");
    member.name = keyScan.nextLine();

    System.out.print("이메일: ");
    member.email = keyScan.nextLine();

    System.out.print("비밀번호: ");
    member.password = keyScan.nextLine();

    System.out.print("재직여부:(y/N) ");
    if (keyScan.nextLine().equals("y")) {
      member.working = true;
    } else {
      member.working = false;
    }

    member.registeredDate = new Date(); // 현재의 날짜와 시간을 생성하여 배열에 저장한다.

    ArrayList.append(member);

    System.out.println("회원을 등록했습니다.");
  }

  static void list() {
    System.out.println("[회원 목록]");

    Object[] arr = ArrayList.toArray();

    int i = 0;
    for (Object obj : arr) {
      Member member = (Member) obj;
      System.out.printf("%d, %s, %s, %s, %b\n", 
          i++, 
          member.name, 
          member.email, 
          String.format("%1$tY-%1$tm-%1$td", member.registeredDate),
          member.working);
    }
  }

}
