package com.surreal;

public class Main {

    public static void main(String[] args) {

        Reciever reciever = new Reciever();



        DataSkicka test = new DataSkicka("text", 100);

        if (reciever != null) {
            reciever.onDataReceived(test);
        }


    }

    

}

    