class Task2 implements Runnable
{
    //public int taskNum;
    //public String taskName;
    @Override
    public void run()
    { 
        for (int i=0; i<=10; i++)
        System.out.println(">> From Task1 - Count=" + i);

    }
}

class GeneralTask {
    int genTaskNum;
    String genTaskName;
}
 
class Task4 extends Thread
{
    //public int taskNum;
    //public String taskName;
    @Override
    public void run()
    { 
        System.out.println("Entering Print Fuction in the Class");
        for(int i=0; i<=count; i++);
        System.out.println(">> From Task4 - Count=" +i);

        System.out.println("Exiting Print Function in the Class");


    }
}

class ThreadDemo {

    public static void main (Strings[] args) {

        //Task 1
        System.out.println("** Starting Main **");

        //Task 2
        //Task t2 = new Task();
        //Task4 t4 = new Task4();
        
        Runnable t2 = new Task2();
        Runnable t4 = new Task4();

        Thread t2Thread = new Thread(t2);
        Thread t4Thread = new Thread(t4);

        t2Thread.start();
        t4Thread.start();

        //Task 3
        System.out.println("** Ending Main **");
    }
}

