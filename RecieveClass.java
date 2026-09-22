public class RecieveClass implements Listener {

    public RecieveClass() {}

    public void getData(ObjectToReturn result) {
        System.out.println(result.getTest());
        System.out.println(result.getTest1());
        System.out.println(result.getTest2());
    }

    @Override
    public void onTaskComplete(ObjectToReturn result) {
        getData(result);
    }
    
}
