package figures;

abstract class Figure {


    protected static final String PIXEL = "＠";
    protected static final String BLANK = "　";


    abstract void draw();


    String getNote() {
        return "上記の図形は，";
    }


    public void drawAndNote() {
        draw();
        System.out.println(getNote());
        System.out.println();
    }
}
