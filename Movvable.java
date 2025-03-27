interface Movable {
    void moveUp();   
    void moveDown();  
    void moveLeft();  
    void moveRight(); 
}
class MovablePoint implements Movable {
    private int x, y;
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void moveUp() {
        y--;
        System.out.println("Moved up: (" + x + ", " + y + ")");
    }
    @Override
    public void moveDown() {
        y++;
        System.out.println("Moved down: (" + x + ", " + y + ")");
    }
    @Override
    public void moveLeft() {
        x--;
        System.out.println("Moved left: (" + x + ", " + y + ")");
    }
    @Override
    public void moveRight() {
        x++;
        System.out.println("Moved right: (" + x + ", " + y + ")");
    }
}
public class Movvable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0);
        point.moveUp();
        point.moveRight();
        point.moveDown();
        point.moveLeft();
    }
}