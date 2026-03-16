package Data;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("------タスク管理システム------");
            System.out.println("1 : タスク追加");
            System.out.println("2 : タスク一覧");
            System.out.println("3 : タスク完了");
            System.out.println("4 : タスク削除");
            System.out.println("5 : 終了");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.println("タスク名を入力してください");
                String name = scanner.nextLine();

                manager.addTask(name);
            }

            else if (choice == 2) {

                manager.showTasks();
            }

            else if (choice == 3) {

                manager.showTasks();

                System.out.println("完了する番号を入力");
                int index = scanner.nextInt();

                manager.completeTask(index - 1);
            }

            else if (choice == 4) {

                manager.showTasks();

                System.out.println("削除する番号を入力");
                int index = scanner.nextInt();

                manager.deleteTask(index - 1);
            }

            else if (choice == 5) {

                System.out.println("終了しました");
                break;
            }
        }
        scanner.close();
    }
}
