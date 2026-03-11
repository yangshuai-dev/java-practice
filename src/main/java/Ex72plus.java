package Ex72plus;

import java.util.ArrayList;

public class Ex72plus {
    public static void main(String[] args) {
        Monster m1 = new Monster("Dragon", 50, 30, 120);
        Monster m2 = new Monster("Slime", 10, 5, 50);
        Monster m3 = new Monster("Jack", 23, 13, 46);
        System.out.println("=== 初期ステータス ===");
        m1.printData();
        m2.printData();
        m3.printData();
        System.out.println();

        System.out.println("--- Level Up! ---");
        m1.upgrade();
        m2.upgrade();
        m2.upgrade();
        m2.upgrade();
        m2.upgrade();
        m2.upgrade();
        m3.upgrade();
        System.out.println();

        System.out.println("=== 成長後ステータス ===");
        m1.printData();
        m2.printData();
        m3.printData();

        System.out.println("=== 戦闘力比較 ===");
        System.out.println("戦闘力が高いのは：" + Monster.topMonster());
        System.out.println();
        System.out.println("総モンスター数: " + Monster.getCount());

        System.out.println("=== 対戦開始 ===");
        ArrayList<Monster> list = new ArrayList<>();

        list.add(m1);
        list.add(m2);
        list.add(m3);

        Battle b = new Battle(list);
        b.start();

    }
}
