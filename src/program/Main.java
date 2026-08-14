import chess.ChessMatch;
import program.UI;

void main(String[] args) {
    ChessMatch chessMatch = new ChessMatch();
    UI.printBoard(chessMatch.getPieces());
}
