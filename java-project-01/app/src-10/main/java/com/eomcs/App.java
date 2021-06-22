package com.eomcs;

import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력 받기
//07. 배열을 이용하여 여러 개의 게시글 보관하기
//08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
//09. 게시글 목록 출력하기
//10. 게시글 상세 조회
public class App {
  public static void main(String[] args) {

    final int BOARD_LENGTH = 3;
    String[] titles = new String[BOARD_LENGTH];
    String[] contents = new String[BOARD_LENGTH];
    String[] passwords = new String[BOARD_LENGTH];
    int size = 0;

    System.out.println("[게시판 관리]");

    Scanner keyScan = new Scanner(System.in);

    loop: while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list":
          System.out.println("[게시글 목록]");

          for (int i = 0; i < size; i++) {
            System.out.printf("%d, %s\n", i, titles[i]);
          }

          break;
        case "add":
          System.out.println("[게시글 등록]");

          if (size == BOARD_LENGTH) {
            System.out.println("더이상 게시글을 추가할 수 없습니다.");
            break;
          }

          System.out.print("제목: ");
          titles[size] = keyScan.nextLine();

          System.out.print("내용: ");
          contents[size] = keyScan.nextLine();

          System.out.print("비밀번호: ");
          passwords[size] = keyScan.nextLine();

          System.out.println("게시글을 등록했습니다.");

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
          System.out.print("번호? ");
          int index = Integer.parseInt(keyScan.nextLine());

          if (index < 0 || index >= size) {
            System.out.println("무효한 게시글 번호입니다.");
            break;
          }

          System.out.printf("제목: %s\n", titles[index]);
          System.out.printf("내용: %s\n", contents[index]);
          System.out.printf("암호: %s\n", passwords[index]);

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
