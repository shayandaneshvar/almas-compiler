package ir.ac.kntu.compiler;

public class InvalidToken {
    private final int row;
    private final int column;
    private final String token;

    public int getRow() {
        return row;
    }


    public int getColumn() {
        return column;
    }


    public String getToken() {
        return token;
    }


    public InvalidToken(int row, int col, String token) {
        this.row = row;
        this.column = col;
        this.token = token;
    }
}
