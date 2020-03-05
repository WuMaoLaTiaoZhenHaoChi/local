package com.dtt.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author: duant
 * @Date: 2020/3/4 16:18
 * @Description:
 */
public class NioDemo {


    public void readFile(){
        try {
            FileChannel inChannel = FileChannel.open(Paths.get("D:/1.txt"), StandardOpenOption.READ);

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (true){
                int read = inChannel.read(buffer);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
