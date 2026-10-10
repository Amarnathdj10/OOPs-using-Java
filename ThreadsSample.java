class CookingTask extends Thread{

    private String task;

    CookingTask(String task){
        this.task = task;
    }

    public void run(){
        System.out.println(task + " is being done by " + Thread.currentThread().getName());
    }
}
class ThreadsSample{
    public static void main(String[] args) {

        Thread name1 = new CookingTask("Cutting vegetables");
        Thread name2 = new CookingTask("Cleaning dishes");
        Thread name3 = new CookingTask("Boiling water");
        Thread name4 = new CookingTask("Stirring pan");

        name1.start();
        name2.start();
        name3.start();
        name4.start();
    }
}