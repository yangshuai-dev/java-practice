package figures;

public class Ellipse extends Figure{
    private double d1;
    private double d2;

    Ellipse(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public void draw() {

    }

    public String getNote() {
        return "高さ：" + d1 + "," + d2 + "の長方形";
    }
}
