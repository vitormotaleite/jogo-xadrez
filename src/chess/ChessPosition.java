package chess;

import boardgame.Position;

public class ChessPosition {

    private char colmun;
    private int row;
    
    public ChessPosition(char colmun, int row) {
        if(colmun < 'a' || colmun > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. valid values are from a1 to h8");
        }
        this.colmun = colmun;
        this.row = row;
    }

    public char getColmun() {
        return colmun;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, colmun - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }
    
    @Override
    public String toString() {
        return "" + colmun + row;
    }
}
