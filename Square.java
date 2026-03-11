package figures;

public class Square extends Rectangle {

    private double side;

    Square(double side) {
        super(side, side);  
        this.side = side;
    }

    @Override
    public String getNote() {
        return "上記の図形は,一辺:" + side + "の正方形";
    }
}
