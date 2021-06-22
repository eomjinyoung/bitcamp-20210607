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
public class App {
  public static void main(String[] args) {

    final int BOARD_LENGTH = 100;
    String[] titles = new String[BOARD_LENGTH];
    String[] contents = new String[BOARD_LENGTH];
    String[] passwords = new String[BOARD_LENGTH];
    int[] viewCounts = new int[BOARD_LENGTH]; // new로 만드는 변수는 기본적으로 0으로 초기화 된다.
    Date[] createdDates = new Date[BOARD_LENGTH];
    int size = 0;

    System.out.println("[게시판 관리]");

    Scanner keyScan = new Scanner(System.in);


    loop: while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      int index = 0;

      switch (command) {
        case "list":
          System.out.println("[게시글 목록]");

          for (int i = 0; i < size; i++) {
            System.out.printf("%d, %s, %s, %d\n", 
                i, 
                titles[i], 
                String.format("%1$tY-%1$tm-%1$td", createdDates[i]),
                viewCounts[i]);
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

          createdDates[size] = new Date(); // 현재의 날짜와 시간을 생성하여 배열에 저장한다.

          System.out.println("게시글을 등록했습니다.");

          size++;

          break;
        case "update":
          System.out.println("[게시글 변경]");

          System.out.print("번호? ");
          index = Integer.parseInt(keyScan.nextLine());

          if (index < 0 || index >= size) {
            System.out.println("무효한 게시글 번호입니다.");
            break;
          }

          System.out.printf("제목(%s)? ", titles[index]);
          String title = keyScan.nextLine();

          System.out.printf("내용(%s)? ", contents[index]);
          String content = keyScan.nextLine();

          System.out.print("정말 변경하시겠습니까?(y/N) ");
          if (!keyScan.nextLine().equals("y")) {
            System.out.println("게시글 변경을 최소하였습니다.");
            break;
          } 

          titles[index] = title;
          contents[index] = content;

          System.out.println("게시글을 변경하였습니다.");

          break;
        case "delete":
          System.out.println("[게시글 삭제]");

          System.out.print("번호? ");
          index = Integer.parseInt(keyScan.nextLine());

          if (index < 0 || index >= size) {
            System.out.println("무효한 게시글 번호입니다.");
            break;
          }

          System.out.print("정말 삭제하시겠습니까?(y/N) ");
          if (!keyScan.nextLine().equals("y")) {
            System.out.println("게시글 삭제를 최소하였습니다.");
            break;
          } 

          for (int i = index; i < size - 1; i++) {
            titles[i] = titles[i + 1];
            contents[i] = contents[i + 1];
            viewCounts[i] = viewCounts[i + 1];
            createdDates[i] = createdDates[i + 1];
          }

          size--;

          System.out.println("게시글을 삭제하였습니다.");

          break;
        case "view":
          System.out.println("[게시글 조회]");

          System.out.print("번호? ");
          index = Integer.parseInt(keyScan.nextLine());

          if (index < 0 || index >= size) {
            System.out.println("무효한 게시글 번호입니다.");
            break;
          }

          viewCounts[index]++;

          System.out.printf("제목: %s\n", titles[index]);
          System.out.printf("내용: %s\n", contents[index]);
          System.out.printf("조회수: %d\n", viewCounts[index]);
          System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", createdDates[index]);

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
