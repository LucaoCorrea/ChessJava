package chess;

import java.awt.Color;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import pieces.*;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        validateTargetPosition(source, target);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece) capturedPiece;
    }

    private Piece makeMove(Position source, Position target) {
        Piece p = board.removPiece(source);
        Piece capturedPiece = board.removPiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }

    private void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("Não há nenhuma peça na posição de origem.");
        }
        if (!board.piece(position).isThereAnyPossibleMove()) {
            throw new ChessException("Não existe movimentos possíveis para esta peça.");
        }
    }

    private void validateTargetPosition(Position source, Position target){
        if (!board.piece(source).possibleMoves(target)) {
            throw new ChessException("A peça escolhida não pode se mover para essa posição.");
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('a', 1, new Rook(board, chess.Color.WHITE));
        placeNewPiece('b', 2, new Rook(board, chess.Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, chess.Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, chess.Color.WHITE));
        placeNewPiece('e', 3, new Rook(board, chess.Color.WHITE));
        placeNewPiece('f', 1, new Rook(board, chess.Color.WHITE));
        placeNewPiece('g', 1, new King(board, chess.Color.WHITE));

        placeNewPiece('a', 7, new Rook(board, chess.Color.BLACK));
        placeNewPiece('b', 8, new Rook(board, chess.Color.BLACK));
        placeNewPiece('c', 7, new Rook(board, chess.Color.BLACK));
        placeNewPiece('d', 8, new Rook(board, chess.Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, chess.Color.BLACK));
        placeNewPiece('f', 7, new Rook(board, chess.Color.BLACK));
        placeNewPiece('g', 8, new King(board, chess.Color.BLACK));
    }
}
