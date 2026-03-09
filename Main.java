public class Main {

    static char[][] initialiseBoard() {

        char[][] chessboardArray = new char[8][8];

        // white pieces are in lowercase
        // black pieces are in uppercase
        // k=king
        // q=queen
        // r=rook
        // b=bishop
        // n=knight
        // p=pawn
        // e=empty

        // adding kings
        chessboardArray[7][4] = 'k';
        chessboardArray[0][4] = 'K';

        // adding queens
        chessboardArray[7][3] = 'q';
        chessboardArray[0][3] = 'Q';

        // adding rooks
        chessboardArray[7][0] = 'r';
        chessboardArray[7][7] = 'r';
        chessboardArray[0][0] = 'R';
        chessboardArray[0][7] = 'R';

        // adding bishops
        chessboardArray[7][2] = 'b';
        chessboardArray[7][5] = 'b';
        chessboardArray[0][2] = 'B';
        chessboardArray[0][5] = 'B';

        // adding knights
        chessboardArray[7][1] = 'n';
        chessboardArray[7][6] = 'n';
        chessboardArray[0][1] = 'N';
        chessboardArray[0][6] = 'N';

        // adding pawns
        for (int rank = 0; rank < 8; rank++) {

            chessboardArray[6][rank] = 'p';
            chessboardArray[1][rank] = 'P';

        }

        // adding empty spaces
        for (int file = 2; file < 6; file++) {

            for (int rank = 0; rank < 8; rank++) {

                chessboardArray[file][rank] = 'e';
                chessboardArray[file][rank] = 'e';

            }

        }

        return chessboardArray;

    }


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

    static void main(String[] args) {

        char[][] chessboard = initialiseBoard();

        printChessBoardToShell(chessboard, 0);

    }
}