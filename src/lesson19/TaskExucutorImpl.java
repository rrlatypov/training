package lesson19;

public class TaskExucutorImpl extends Thread implements TaskExecutor {
    private  TasksStorage storage;
    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        if (storage ==null){
            throw new NullPointerException(" хранилище не может быть null !");
        }
        this.storage = storage;

    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void run() {
       while (true){
           Task task = storage.get();

           if (task == null) {
               System.out.println(this.getName() + " задач в хранилище нет. завершаю работу");
               break;
           } else {
               System.out.println(this.getName() + " начинаю выполнять задачу: " + task);
               try {
                   task.execute();
                   System.out.println(this.getName() + " задачу выполнил успешно" + task);
               } catch (TaskExecutionFailedException e) {
                   System.out.println(this.getName() + " не смог выполнить задачу" + task);
                   if (task.getTryCount() <5){
                       task.incTryCount();
                       System.out.println(this.getName() + " возвращаю задачу обратно" + task);
                       storage.add(task);
                   } else{
                       System.out.println(this.getName() + " удаляю задачу" + task);
                   }
               }
           }
       }
    }
}
