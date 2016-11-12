/**
 * Created by romario on 07.11.16.
 */
public class Human implements Driver , Runnable {
    @Override
    public void drive() {
        System.out.println("Brrrrrr");
    }

    void go(){
        System.out.println("fff");
    }

    @Override
    public void run() {
        System.out.println("first core");
    }
}
