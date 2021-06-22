package com.eomcs;

import java.util.Date;
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
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기
public class App {

  // 한 개의 게시글을 담을 변수를 설계
  static class Board {
    String title;
    String content;
    String password;
    int viewCount;
    Date createdDate;
  }

  static final int BOARD_LENGTH = 100;
  static Board[] boards = new Board[BOARD_LENGTH]; // 100개의 식판을 꼽을 운반기 준비
  static int size = 0;

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("[게시판 관리]");

    loop: while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": list(); break;
        case "add": add(); break;
        case "update": update(); break;
        case "delete": delete(); break;
        case "view": view(); break;
        case "quit":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
    }

    keyScan.close();

    System.out.println("안녕히 가세요!");
  }

  static void list() {
    System.out.println("[게시글 목록]");

    for (int i = 0; i < size; i++) {
      Board board = boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          i, 
          board.title, 
          String.format("%1$tY-%1$tm-%1$td", board.createdDate),
          board.viewCount);
    }
  }

  static void add() {
    System.out.println("[게시글 등록]");

    if (size == BOARD_LENGTH) {
      System.out.println("더이상 게시글을 추가할 수 없습니다.");
      return;
    }

    // 한 개의 게시글 데이터를 저장할 변수를 준비한다.
    Board board = new Board(); // Board 설계도에 따라 변수를 만들고 그 주소를 리턴한다.

    System.out.print("제목: ");
    board.title = keyScan.nextLine();

    System.out.print("내용: ");
    board.content = keyScan.nextLine();

    System.out.print("비밀번호: ");
    board.password = keyScan.nextLine();

    board.createdDate = new Date(); // 현재의 날짜와 시간을 생성하여 배열에 저장한다.

    // 배열에 게시글 정보가 담긴 객체(식판)을 넣는다.
    boards[size++] = board;

    System.out.println("게시글을 등록했습니다.");
  }

  static void update() {
    System.out.println("[게시글 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = boards[index];

    System.out.printf("제목(%s)? ", board.title);
    String title = keyScan.nextLine();

    System.out.printf("내용(%s)? ", board.content);
    String content = keyScan.nextLine();

    System.out.print("정말 변경하시겠습니까?(y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("게시글 변경을 최소하였습니다.");
      return;
    } 

    board.title = title;
    board.content = content;

    System.out.println("게시글을 변경하였습니다.");
  }

  static void delete() {
    System.out.println("[게시글 삭제]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    System.out.print("정말 삭제하시겠습니까?(y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("게시글 삭제를 최소하였습니다.");
      return;
    } 

    for (int i = index; i < size - 1; i++) {
      boards[i] = boards[i + 1];
    }

    size--;

    System.out.println("게시글을 삭제하였습니다.");
  }

  static void view() {
    System.out.println("[게시글 조회]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = boards[index];

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("조회수: %d\n", board.viewCount);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", board.createdDate);
  }

}
