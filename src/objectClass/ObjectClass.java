package objectClass;

import java.util.Objects;

public class ObjectClass {

    public static void main(String[] args) {

        Punkt[] punkts = new Punkt[4];
        punkts[0] = new Punkt(4, 10);
        punkts[1] = new Punkt(6, 12);
        punkts[2] = new Punkt(8, 5);
        punkts[3] = new Punkt(2, 120);

        for (Punkt punkt : punkts) {
            System.out.println(punkt);
        }
    }
}

class Punkt {
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Punkt przyslany = (Punkt) o;
        return this.x == przyslany.getX() && this.y == przyslany.getY();
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
