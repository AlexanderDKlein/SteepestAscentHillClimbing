public class Cell {
    //Declares variables
    private String name;
    private Cell up;
    private Cell down;
    private Cell left;
    private Cell right;
    private Cell upLeft;
    private Cell upRight;
    private Cell downLeft;
    private Cell downRight;

    //Constructor
    public Cell(String n, Cell u, Cell d, Cell l, Cell r, Cell ul, Cell ur, Cell dl, Cell dr) {
        name = n;
        up = u;
        down = d;
        left = l;
        right = r;
        upLeft = ul;
        upRight = ur;
        downLeft = dl;
        downRight = dr;
    }

    //Defines getters
    public String getName() {
        return name;
    }
    public Cell getUp() {
        return up;
    }
    public Cell getDown() {
        return down;
    }
    public Cell getLeft() {
        return left;
    }
    public Cell getRight() {
        return right;
    }
    public Cell getUpLeft() {
        return upLeft;
    }
    public Cell getUpRight() {
        return upRight;
    }
    public Cell getDownLeft() {
        return downLeft;
    }
    public Cell getDownRight() {
        return downRight;
    }

    //Defines setters
    public void setName(String n) {
        name = n;
    }
    public void setUp(Cell c) {
        up = c;
    }
    public void setDown(Cell c) {
        down = c;
    }
    public void setLeft(Cell c) {
        left = c;
    }
    public void setRight(Cell c) {
        right = c;
    }
    public void setUpLeft(Cell c) {
        upLeft = c;
    }
    public void setUpRight(Cell c) {
        upRight = c;
    }
    public void setDownLeft(Cell c) {
        downLeft = c;
    }
    public void setDownRight(Cell c) {
        downRight = c;
    }
}
