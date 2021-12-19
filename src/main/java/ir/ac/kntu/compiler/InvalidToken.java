package ir.ac.kntu.compiler;

public class InvalidToken {
    private int row;
    private int column;
    private String token;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public InvalidToken(int row, int col, String token) {
        this.row = row;
        this.column = col;
        this.token = token;
    }
}
