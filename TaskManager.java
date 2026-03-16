package Data;

import java.util.ArrayList;

class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();

    void addTask(String name) {
        tasks.add(new Task(name));
        System.out.println("タスクを追加しました");
    }

    void showTasks() {

        if (tasks.size() == 0) {
            System.out.println("タスクがありません");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {

            Task t = tasks.get(i);

            String status;

            if (t.completed) {
                status = "完了";
            } else {
                status = "未完了";
            }

            System.out.println((i + 1) + " : " + t.name + " [" + status + "]");
        }
    }

    void completeTask(int index) {

        if (index >= 0 && index < tasks.size()) {

            tasks.get(index).completed = true;
            System.out.println("タスクを完了しました");
        }
    }

    void deleteTask(int index) {

        if (index >= 0 && index < tasks.size()) {

            tasks.remove(index);
            System.out.println("タスクを削除しました");
        }
    }
}