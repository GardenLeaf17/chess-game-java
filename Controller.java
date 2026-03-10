public class Controller {

    public static char[][] initialiseBoard() {

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

}