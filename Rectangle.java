package figures;

public class Rectangle extends Figure {
    protected double width;
    protected double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(PIXEL);
            }
            System.out.println();
        }
    }

    @Override
    public String getNote() {
        return "上記の図形は,幅,高さ:" + width + "，" + height + "の長方形";
    }
}
