package elementary.task1;

import util.StringUtil;

public class ChessBoardApp {

    private static final String runInstruction = "To run app you need specify at least two number arguments:" +
            " width, height of ChessBoard.";

    public static void main(String[] args) {
        checkStartAppArgs(args);

        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        ChessBoard chessBoard = new ChessBoard(width, height);
        chessBoard.printBoard();
    }

    private static void checkStartAppArgs(String[] args) {
        int requiredNumberOfArguments = 2;
        if (args.length != requiredNumberOfArguments ||
                StringUtil.isNotNumeric(args[0]) || StringUtil.isNotNumeric(args[1])) {

            System.out.println(ChessBoardApp.runInstruction);
            System.exit(1);
        }
    }
}
