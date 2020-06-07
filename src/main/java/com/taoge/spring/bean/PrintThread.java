package com.taoge.spring.bean;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PrintThread implements Runnable {

    private PipedInputStream pipedInputStream;

    public PrintThread(PipedInputStream inputStream){
        this.pipedInputStream=inputStream;
    }

    public void run() {
        int receive=0;
        try {
            while((receive=pipedInputStream.read())!=-1){
                System.out.println((char)receive);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        PipedInputStream pipedInputStream=new PipedInputStream();
        PipedOutputStream outputStream=new PipedOutputStream();
        outputStream.connect(pipedInputStream);
        new Thread(new PrintThread(pipedInputStream)).start();
        byte[] data="hello".getBytes();
        int i=0;
        while(i<data.length){
            outputStream.write(data[i]);
            Thread.sleep(1000);
            i++;
        }
        outputStream.close();
    }
}
