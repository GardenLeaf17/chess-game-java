public class Output {

    static void printChessBoardToShell(char[][] chessboardArray, int turn) {

        if (turn == 1) {

            // invert array for black's perspective
            for (int file = 0; file < 8; file++) {

                for (int rank = 0; rank < 4; rank++) {

                    char tempVal = chessboardArray[file][rank];
                    chessboardArray[file][rank] = chessboardArray[7-file][7-rank];
                    chessboardArray[7-file][7-rank] = tempVal;

                }

            }

        }

        System.out.print("\n   +---+---+---+---+---+---+---+---+");

        for (int file = 0; file < 8; file++) {

            int index = 8 - file;

            if (turn == 1) {

                index = file + 1;

            }

            System.out.print("\n "+(index)+" |");

            for (int rank = 0; rank < 8; rank++) {

                switch (chessboardArray[file][rank]) {

                    case 'k':
                        System.out.print(" ♚ |");
                        break;

                    case 'K':
                        System.out.print(" ♔ |");
                        break;

                    case 'q':
                        System.out.print(" ♛ |");
                        break;

                    case 'Q':
                        System.out.print(" ♕ |");
                        break;

                    case 'r':
                        System.out.print(" ♜ |");
                        break;

                    case 'R':
                        System.out.print(" ♖ |");
                        break;

                    case 'b':
                        System.out.print(" ♝ |");
                        break;

                    case 'B':
                        System.out.print(" ♗ |");
                        break;

                    case 'n':
                        System.out.print(" ♞ |");
                        break;

                    case 'N':
                        System.out.print(" ♘ |");
                        break;

                    case 'p':
                        System.out.print(" ♟ |");
                        break;

                    case 'P':
                        System.out.print(" ♙ |");
                        break;

                    default:
                        System.out.print("   |");
                        break;

                }

            }

            System.out.print("\n   +---+---+---+---+---+---+---+---+");

        }

        if (turn == 1) {

            System.out.print("\n     h   g   f   e   d   c   b   a");

        } else {

            System.out.print("\n     a   b   c   d   e   f   g   h");

        }

    }

}
