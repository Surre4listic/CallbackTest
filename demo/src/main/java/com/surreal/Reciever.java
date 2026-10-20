package com.surreal;
public class Reciever implements Listener {



    @Override
    public void onDataReceived(DataSkicka data) {

        System.out.println("DataReceiver tog emot: " + data);
        System.out.println(data.test1);
        System.out.println(data.test2);

        
    }



}
