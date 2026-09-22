import java.util.Timer;

public class Main {

    public static void main(String[] args) {


        Timer timer = new Timer();

        RecieveClass reciever = new RecieveClass();

        TimerClass task = new TimerClass(reciever);

        System.out.println("Start timer.");

        // timer.scheduleAtFixedRate(task, 0, 3000);
        timer.schedule(task, 3000);





    }

}