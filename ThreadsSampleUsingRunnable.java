class CookingTask implements Runnable{

    private String task;

    CookingTask(String task){
        this.task = task;
    }

    public void run(){
        System.out.println(task + " is being done by " + Thread.currentThread().getName());
    }
}
public class ThreadsSampleUsingRunnable{
    public static void main(String[] args) {

        Thread name1 = new Thread(new CookingTask("Cutting vegetables"));
        Thread name2 = new Thread(new CookingTask("Cleaning dishes"));
        Thread name3 = new Thread(new CookingTask("Boiling water"));
        Thread name4 = new Thread(new CookingTask("Stirring pan"));

        name1.start();
        name2.start();
        name3.start();
        name4.start();
    }
}