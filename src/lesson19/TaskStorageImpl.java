package lesson19;

import java.util.LinkedList;

public class TaskStorageImpl implements  TasksStorage {
    private  LinkedList <Task> tasks = new LinkedList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null){
            throw new NullPointerException(" задача не может быть null ");
        }
        tasks.add(task);

    }

    @Override
    public synchronized  Task get() {
        if (tasks.size() == 0 ) {
            return null;
        }
        return tasks.removeFirst();
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
