class Task2 extends Thread{
    @Override
    public void run()
    {
        System.out.println("Entering Print Function in the class");
        for(int i=0; i<=10; i++)
        System.out.println(">> From Task2 - Count=" + i);
        System.out.println("Exiting Print Function in the class");
    }
}
    class Task4 extends Thread{
    @Override
    public void run()
    {
        System.out.println("Entering Print Function in the class");
        for(int i=0; i<=10; i++)
        System.out.println(">> From Task4 - Count=" + i);
        System.out.println("Exiting Print Function in the class");
    }
}
    public class ThreadDemo
    {
    public static void main(String[] args) {
        //int num = 5;
        
        //Task2 myTask = new Task2();
        //myTask.taskName = "example of Threads";
        //myTask.taskNum = 2;
        
        //Task 1
        System.out.println("* Starting Main * ");
        
        //Task 2
        Task2 t2 = new Task2();
        Task4 t4 = new Task4();
        
        t2.start();
        t4.start();
        
        //Task 3
        System.out.println("* Ending Main * ");
    }
}