import java.util.InputMismatchException;
import java.util.Scanner;

// Irakli Gurgenidze
// 4/1/19
// This class has all the methods required to play TwistTacToe
public class TwistTacToe {

  private String[][] board;
  private String move;
  private String victoriousPlayer;

  public TwistTacToe() { // play the game
    board = new String[3][3];
    move = "X";
    victoriousPlayer = "No one yet.";
  }

  public static void playTTT() {
    TwistTacToe currentBoard = new TwistTacToe();
    Scanner userInput = new Scanner(System.in);

    currentBoard.placePlaceholders(); // initialize initial empty values

    System.out.println("Welcome to Twist Tac Toe!\n\n"
        + "You're probably wondering... what's the twist?\n"
        + "As you know, a puny program like me is no match for the processing powerhouse that is the human mind.\n"
        + "So, to give you the hardest match possible, you will be playing against...\n\nYOURSELF!\n\n"
        + "Since you haven't closed the program yet, I assume you're intrigued. Shall we get started?\n");

    System.out.println("Starting board: ");

    currentBoard.printBoard(); // print the board's starting orientation

    while (!(currentBoard.getVictoriousPlayer().equals("No one yet"))) {
      System.out.println(currentBoard.getMove() + " please enter the coordinates of your move: ");

      int xCoor;
      int yCoor;

      // System.out.println("Checkpoint 1");

      try {
        // System.out.println("Checkpoint 2");
        xCoor = userInput.nextInt();
        yCoor = userInput.nextInt();
        if (!((xCoor > 0 && xCoor <= 3) && (yCoor > 0 && yCoor <= 3))) {
          System.out.println(
              "Oops! You messed up. Please input the x-y coordinate of your move spot like this: 1 2");
          continue;
        }
      } catch (InputMismatchException e) {
        System.out.println(
            "Oops! You messed up. Please input the x-y coordinate of your move spot like this: 1 2");
        continue;
      }

      if (currentBoard.getBoard(xCoor - 1, yCoor - 1).equals(" ")) {
        currentBoard.setBoard(currentBoard.getMove(), xCoor - 1, yCoor - 1);
      } else {
        System.out.println("We run a tight establishment here. Try another square. ");
        continue;
      }


      currentBoard.setVictoriousPlayer(currentBoard.checkWinner());
      // System.out.println(currentBoard.getVictoriousPlayer());

      if (currentBoard.getVictoriousPlayer().equalsIgnoreCase("draw")) {
        System.out.println("Wow. You drew with yourself. Stop being so indecisive.");
        break;
      } else if (currentBoard.getVictoriousPlayer().equalsIgnoreCase("X")) {
        System.out.println("Hey look! You (x) won!");
        break;
      } else if (currentBoard.getVictoriousPlayer().equalsIgnoreCase("O")) {
        System.out.println("Hey look! You (o) won!");
        break;
      }

      if (currentBoard.getMove().equals("X")) {
        currentBoard.setMove("O");
      } else {
        currentBoard.setMove("X");
      }

      currentBoard.printBoard();
    }

    userInput.close();

  }

  public void printBoard() { // print the board after each turn
    System.out.println("-------------");
    System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
    System.out.println("|-----------|");
    System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
    System.out.println("|-----------|");
    System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
    System.out.println("-------------");
  }

  public String checkWinner() { // see if someone has won yet
    for (int caseCounter = 0; caseCounter < 8; caseCounter++) {
      String line = null;
      switch (caseCounter) {
        case 0:
          line = board[0][0] + board[0][1] + board[0][2];
          break;
        case 1:
          line = board[1][0] + board[1][1] + board[1][2];
          break;
        case 2:
          line = board[2][0] + board[2][1] + board[2][2];
          break;
        case 3:
          line = board[0][0] + board[1][0] + board[2][0];
          break;
        case 4:
          line = board[0][1] + board[1][1] + board[2][1];
          break;
        case 5:
          line = board[0][2] + board[1][2] + board[2][2];
          break;
        case 6:
          line = board[0][0] + board[1][1] + board[2][2];
          break;
        case 7:
          line = board[0][2] + board[1][1] + board[2][0];
          break;
      }

      String drawyet = "yes";
      for (String[] d : board) {
        for (String e : d) {
          if (e.equalsIgnoreCase(" "))
            drawyet = "no";
        }
      }

      if (line.equals("XXX") && drawyet.equals("no")) {
        return "X";
      } else if (line.equals("OOO") && drawyet.equals("no")) {
        return "O";
      } else if (drawyet.equals("yes")) {
        return "draw";
      }
    }
    return "keep going";

  }

  public void placePlaceholders() { // make the board's initial presentation less confusing
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = " ";
      }
    }

  }

  // getters and setters
  public String getBoard(int x, int y) {
    return this.board[x][y];
  }

  public void setBoard(String holder, int x, int y) {
    this.board[x][y] = holder;
  }

  public String getMove() {
    return this.move;
  }

  public void setMove(String holder) {
    this.move = holder;
  }

  public String getVictoriousPlayer() {
    return this.victoriousPlayer;
  }

  public void setVictoriousPlayer(String value) {
    this.victoriousPlayer = value;
  }
}
