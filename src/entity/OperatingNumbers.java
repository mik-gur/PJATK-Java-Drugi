package entity;

public class OperatingNumbers {
    private int x;
    private int y;
    private double w;
    private double z;
    private int m;
    private int n;
    private int o;

    public int incrementX(int x) {
        return this.x = ++x;
    }

    public int incrementY(int y) {
        int y1 = y++;
        setY(y);
        return y1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }
}
