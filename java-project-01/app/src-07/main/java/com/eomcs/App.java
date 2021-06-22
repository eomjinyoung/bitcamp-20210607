package com.eomcs;

import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력 받기
//07. 배열을 이용하여 여러 개의 게시글 보관하기
public class App {
  public static void main(String[] args) {

    String[] titles = new String[200];
    String[] contents = new String[200];
    String[] passwords = new String[200];
    int size = 0;


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
          System.out.print("제목: ");
          titles[size] = keyScan.nextLine();

          System.out.print("내용: ");
          contents[size] = keyScan.nextLine();

          System.out.print("비밀번호: ");
          passwords[size] = keyScan.nextLine();

          System.out.printf("제목: %s\n", titles[size]);
          System.out.printf("내용: %s\n", contents[size]);
          System.out.printf("암호: %s\n", passwords[size]);

          size++;

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
