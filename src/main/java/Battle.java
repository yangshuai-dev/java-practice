package Ex72plus;

import java.util.ArrayList;

public class Battle {
    Monster[] monsters;

    Battle(Monster[] monsters) {
        this.monsters = monsters;
    }

    Battle(ArrayList<Monster> list) {
        this.monsters = list.toArray(new Monster[0]);
    }

    void start() {
        for (int i = 0; i < monsters.length - 1; i++) {

            if (monsters[i].getLevel() > monsters[i + 1].getLevel()) {

                while (monsters[i].getHp() > 0 && monsters[i + 1].getHp() > 0) {

                    double num = Math.random();
                    if (num > 0.8) {
                        System.out.println("Miss");
                    } else {

                        // m1 の攻撃
                        int d = monsters[i].getAttack() - monsters[i + 1].getDefense();
                        if (d <= 0) {
                            System.out.println(monsters[i + 1].getName() + " には効果がない！");
                        } else {
                            int newHp = monsters[i + 1].getHp() - d;
                            monsters[i + 1].setHp(newHp);
                            System.out.println(monsters[i + 1].getName() + " に " + d + " ダメージ！");
                        }

                        // m2 の攻撃
                        d = monsters[i + 1].getAttack() - monsters[i].getDefense();
                        if (d <= 0) {
                            System.out.println(monsters[i].getName() + " には効果がない！");
                        } else {
                            int newHp = monsters[i].getHp() - d;
                            monsters[i].setHp(newHp);
                            System.out.println(monsters[i].getName() + " に " + d + " ダメージ！");
                        }
                    }
                }

            } else if (monsters[i].getLevel() < monsters[i + 1].getLevel()) {

                while (monsters[i].getHp() > 0 && monsters[i + 1].getHp() > 0) {

                    double num = Math.random();
                    if (num > 0.8) {
                        System.out.println("Miss");
                    } else {

                        // m2 の攻撃
                        int d = monsters[i + 1].getAttack() - monsters[i].getDefense();
                        if (d <= 0) {
                            System.out.println(monsters[i].getName() + " には効果がない！");
                        } else {
                            int newHp = monsters[i].getHp() - d;
                            monsters[i].setHp(newHp);
                            System.out.println(monsters[i].getName() + " に " + d + " ダメージ！");
                        }

                        // m1 の攻撃
                        d = monsters[i].getAttack() - monsters[i + 1].getDefense();
                        if (d <= 0) {
                            System.out.println(monsters[i + 1].getName() + " には効果がない！");
                        } else {
                            int newHp = monsters[i + 1].getHp() - d;
                            monsters[i + 1].setHp(newHp);
                            System.out.println(monsters[i + 1].getName() + " に " + d + " ダメージ！");
                        }
                    }
                }


            } else { // レベルが同じ

                double num = Math.random();

                if (num >= 0.5) {

                    while (monsters[i].getHp() > 0 && monsters[i + 1].getHp() > 0) {
                        num = Math.random();

                        if (num > 0.8) {
                            System.out.println("Miss");
                        } else {

                            // m1 の攻撃
                            int d = monsters[i].getAttack() - monsters[i + 1].getDefense();
                            if (d <= 0) {
                                System.out.println(monsters[i + 1].getName() + " には効果がない！");
                            } else {
                                int newHp = monsters[i + 1].getHp() - d;
                                monsters[i + 1].setHp(newHp);
                                System.out.println(monsters[i + 1].getName() + " に " + d + " ダメージ！");
                            }

                            // m2 の攻撃
                            d = monsters[i + 1].getAttack() - monsters[i].getDefense();
                            if (d <= 0) {
                                System.out.println(monsters[i].getName() + " には効果がない！");
                            } else {
                                int newHp = monsters[i].getHp() - d;
                                monsters[i].setHp(newHp);
                                System.out.println(monsters[i].getName() + " に " + d + " ダメージ！");
                            }
                        }
                    }

                } else {

                    while (monsters[i].getHp() > 0 && monsters[i + 1].getHp() > 0) {
                        num = Math.random();

                        if (num > 0.8) {
                            System.out.println("Miss");
                        } else {

                            // m2 の攻撃
                            int d = monsters[i + 1].getAttack() - monsters[i].getDefense();
                            if (d <= 0) {
                                System.out.println(monsters[i].getName() + " には効果がない！");
                            } else {
                                int newHp = monsters[i].getHp() - d;
                                monsters[i].setHp(newHp);
                                System.out.println(monsters[i].getName() + " に " + d + " ダメージ！");
                            }

                            // m1 の攻撃
                            d = monsters[i].getAttack() - monsters[i + 1].getDefense();
                            if (d <= 0) {
                                System.out.println(monsters[i + 1].getName() + " には効果がない！");
                            } else {
                                int newHp = monsters[i + 1].getHp() - d;
                                monsters[i + 1].setHp(newHp);
                                System.out.println(monsters[i + 1].getName() + " に " + d + " ダメージ！");
                            }
                        }
                    }
                }
            }

            showPrint(i);
        }
    }

    void showPrint(int i) {
        System.out.println();
        if (monsters[i].getHp() <= 0)
            System.out.println(monsters[i].getName() + "HP が 0になった方が負けました！！！\n勝者は"
                    + monsters[i + 1].getName() + "です。");
        else
            System.out.println(monsters[i + 1].getName() + "HP が 0になった方が負けました！！！\n勝者は"
                    + monsters[i].getName() + "です。");
    }

}
