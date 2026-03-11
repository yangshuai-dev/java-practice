package Ex82;

public class KujiPlayer {
    private Kuji kuji;
    private int drawCount = 0;
    private int hitCount = 0;

    public KujiPlayer(Kuji kuji) {
        this.kuji = kuji;
    }

    public boolean draw(int n) {
        int index = n - 1;
        drawCount++;

        if (kuji.getKuji()[index] == 1) {
            hitCount++;
            return true;
        } else {
            return false;
        }
    }

    public int getDrawCount() {
        return drawCount;
    }

    public int getHitCount() {
        return hitCount;
    }
}
