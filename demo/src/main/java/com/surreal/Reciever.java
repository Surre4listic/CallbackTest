package com.surreal;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Reciever implements Listener {

    @Override
    public void onDataReceived(DataSkicka data) {

        System.out.println("DataReceiver tog emot: " + data);
        System.out.println(data.test1);
        System.out.println(data.test2);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(data));
        
    }

}
