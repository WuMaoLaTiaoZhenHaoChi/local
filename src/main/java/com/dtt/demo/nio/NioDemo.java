package com.dtt.demo.nio;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: duant
 * @Date: 2020/3/4 16:18
 * @Description:
 */
public class NioDemo {


    @Test
    public void readFile() {
        FileInputStream fis = null;
        FileChannel inChannel = null;
        try {
            fis = new FileInputStream("D:\\2");
            inChannel = fis.getChannel();

            ByteBuffer dst = ByteBuffer.allocate(1024);
            int len = -1;
            int sum = 0;
            while ((len = inChannel.read(dst)) != -1) {
                dst.flip();
                for (int i = 0; i < len; i++) {
                    System.out.print((dst.get(i) & 0xFF) + "\t");
                }
                dst.clear();
                sum++;
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inChannel.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
