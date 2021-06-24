package com.eomcs;

import java.util.Date;
import java.util.Scanner;
import com.eomcs.App.Board;

public class BoardHandler {

  static Scanner keyScan;

  static void list() {
    System.out.println("[게시글 목록]");

    Object[] arr = ArrayList.toArray();
    int i = 0;
    for (Object item : arr) {
      Board board = (Board) item;
      System.out.printf("%d, %s, %s, %d\n", 
          i++, 
          board.title, 
          String.format("%1$tY-%1$tm-%1$td", board.createdDate),
          board.viewCount);
    }
  }

  static void add() {
    System.out.println("[게시글 등록]");

    if (ArrayList.size == ArrayList.MAX_LENGTH) {
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

    ArrayList.append(board);

    System.out.println("게시글을 등록했습니다.");
  }

  static void update() {
    System.out.println("[게시글 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= ArrayList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) ArrayList.retrieve(index);

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

    if (index < 0 || index >= ArrayList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    System.out.print("정말 삭제하시겠습니까?(y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("게시글 삭제를 최소하였습니다.");
      return;
    } 

    ArrayList.remove(index);

    System.out.println("게시글을 삭제하였습니다.");
  }

  static void view() {
    System.out.println("[게시글 조회]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= ArrayList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) ArrayList.retrieve(index);

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("조회수: %d\n", board.viewCount);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", board.createdDate);
  }
}
