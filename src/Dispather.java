/**
 * Created by romario on 07.11.16.
 */
public class Dispather {
    static  int k;
    public static void main(String[] args) throws InterruptedException {

        Human h = new Human();
        h.drive();
        h.go();
        Driver driver;
        driver = h;
        driver.drive();
        Thread thread =new Thread(h);
        thread.start();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
           while (true){
              k++;
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }



           }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true){
                    System.out.println(k);
                }
            }
        });
        thread2.start();

        thread1.start();

    }
}
