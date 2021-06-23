package com.eomcs;

public class Test {

  static class Board {
    int no;
    String title;
    String content;
    int viewCount;
  }

  public static void main(String[] args) {
    Board[] boards = new Board[3];

    boards[0] = new Board();
    boards[1] = new Board();
    boards[2] = new Board();

    boards[0].title = "aaa";
    boards[1].title = "bbb";
    boards[2].title = "ccc";

    System.out.println(boards[0].title);
    System.out.println(boards[1].title);
    System.out.println(boards[2].title);

    System.out.println("종료!");
  }

}
