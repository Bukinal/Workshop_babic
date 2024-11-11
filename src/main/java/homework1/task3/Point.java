package homework1.task3;

public class Point implements Movable {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }


    @Override
    public void moveUp() {
        this.y += 1;
        System.out.println("Moving at " + x + ", " + y);

    }

    @Override
    public void moveDown() {
        this.y -= 1;
        System.out.println("Moving at " + x + ", " + y);
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
        System.out.println("Moving at " + x + ", " + y);
    }

    @Override
    public void moveRight() {
        this.x += 1;
        System.out.println("Moving at " + x + ", " + y);
    }
}