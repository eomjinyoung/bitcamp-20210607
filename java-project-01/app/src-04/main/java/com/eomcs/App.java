package com.eomcs;

import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
public class App {
  public static void main(String[] args) {
    System.out.println("[게시판 관리]");

    Scanner keyScan = new Scanner(System.in);

    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      if (command.equals("quit")) {
        break;
      }

      System.out.println(command);
    }

    keyScan.close();

    System.out.println("안녕히 가세요!");
  }
}
