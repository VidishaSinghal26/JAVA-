class MyThreadPriority implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            Thread.currentThread().setPriority(i);
            if (i == 6) {
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}
class ThreadPriority
{
    public static void main(String[] args) {
        MyThreadPriority t1 = new MyThreadPriority();
        Thread obj=new Thread(t1);
        obj.start();
    }
}
