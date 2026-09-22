import java.util.TimerTask;

public class TimerClass extends TimerTask {

    private final Listener listener;

    public TimerClass(Listener listener) {
        this.listener = listener;
    }

    @Override 
    public void run() {
        try {

            String test1 = "Random text here";
            int test2 = 25;
            Object test3 = new Object();

            ObjectToReturn result = new ObjectToReturn(test1, test2, test3);

            if (listener != null) {
                listener.onTaskComplete(result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
