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
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기
//17. 클래스를 이용하여 메서드를 분류하기 
//18. 데이터 목록을 다루는 코드를 재사용하기 쉽게 별도의 클래스로 분리한다.
//19. 메뉴 선택 기능을 추가
//20. 리팩토링: 메서드 추출 => 게시글 관리 메뉴 처리 코드를 별도의 메서드를 분리한다.
//21. 리팩토링: 
//      - 메서드 이동 => 게시글을 다루는 일은 BoardHandler에게 맡긴다.
//      - 클래스 이동 => Board 클래스를 사용하는 BoardHandler로 옮긴다.
//22. 메뉴 추가하기
//      - 회원 관리 기능을 추가하기(미완성)
//      - 계산기 기능을 추가하기(완성)
//23. 메뉴를 실행하는 핸들러의 사용 규칙을 통일하기 : 인터페이스 문법의 용도 
//      - 규칙 정의 : Handler
//      - 규칙을 이행(implement) : BoardHandler, MemberHandler, ComputeHandler
//24. 회원 관리 기능 완성하기
//      - 회원 정보를 담을 데이터 타입을 새로 설계한다. => Member
//      - 회원 등록, 목록 조회, 상세 조회, 변경, 삭제 기능을 구현한다.
//      - 게시글과 회원 데이터를 함께 보관할 때 문제점 확인하기
//25. 회원 데이터를 별도의 목록으로 관리하기(단순한 방법 = 유지보수가 어렵다)
//      - 기존의 ArrayList 클래스를 복사하여 ArrayList2 로 만들어 사용한다.
public class App {

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    // App 클래스에서 만든 Scanner 인스턴스를 BoardHandler와 MemberHandler가 같이 쓴다.
    BoardHandler.keyScan = keyScan;
    MemberHandler.keyScan = keyScan;
    ComputeHandler.keyScan = keyScan;

    // 규칙에 따라 만든 클래스에 대해 
    // 규칙에서 정의한 메서드를 호출하려면 
    // 먼저 그 클래스의 인스턴스를 생성한 후 
    // 그 인스턴스를 이용하여 메서드를 호출해야 한다.
    BoardHandler boardHandler = new BoardHandler();
    MemberHandler memberHandler = new MemberHandler();
    ComputeHandler computeHandler = new ComputeHandler();

    menuLoop: while (true) {
      System.out.println("[메뉴]");
      System.out.println("  1: 게시글 관리");
      System.out.println("  2: 회원 관리");
      System.out.println("  3: 계산기");
      System.out.print("메뉴를 선택하시오. (종료: quit) [1..3] ");
      String menuNo = keyScan.nextLine();

      switch (menuNo) {
        case "1":
          boardHandler.execute();
          break;
        case "2":
          memberHandler.execute();
          break;
        case "3":
          computeHandler.execute();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
      System.out.println();
    }

    keyScan.close();
    System.out.println("안녕히 가세요!");
  }
}
