package Ex82;

import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        KujiPlayer k = new KujiPlayer(new Kuji());
        while (k.getDrawCount() < 10 && k.getHitCount() < 3) {
            System.out.print("何か入力するとくじを引きます。");
            int n = s.nextInt();
            boolean r = k.draw(n);
            for (int i = 0; i < 10; i++) {
                System.out.print("■");
                delay(100);
            }
            
            if (r) {
                System.out.println("→当たり!");
            } else {
                System.out.println("→残念...");
            }

        }
        s.close();
        System.out.println("当たりが 3 回出たので終了します。");
    }

    static void delay(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
