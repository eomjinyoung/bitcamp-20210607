package com.eomcs;

import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
public class App {
  public static void main(String[] args) {
    System.out.println("[게시판 관리]");

    Scanner keyScan = new Scanner(System.in);

    loop: while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list":
          System.out.println("[게시글 목록]");
          break;
        case "add":
          System.out.println("[게시글 등록]");
          break;
        case "update":
          System.out.println("[게시글 변경]");
          break;
        case "delete":
          System.out.println("[게시글 삭제]");
          break;
        case "view":
          System.out.println("[게시글 조회]");
          break;
        case "quit":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
    }

    keyScan.close();

    System.out.println("안녕히 가세요!");
  }
}
