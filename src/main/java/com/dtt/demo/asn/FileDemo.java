package com.dtt.demo.asn;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: duant
 * @Date: 2020/3/5 16:25
 * @Description:
 */
public class FileDemo {

    private static final int X00 = 0X00;// 00000000
    private static final int X1F = 0X1F;// 00011111
    private static final int X7F = 0X7F;// 01111111
    private static final int X01 = 0X01;// 00000001
    private static final int XFF = 0XFF;// 11111111

    private static int INDEX = 0;

    @Test
    public void read() {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("D:\\2");
            byte[] bytes = new byte[10240];

            int len = -1;
            if ((len = fis.read(bytes)) != -1) {
                for (byte bt : bytes) {
                    System.out.print((bt & XFF) + "\t");
                }
            }

            getTag(bytes);
            //getLen(bytes);
            getLenVal(bytes,getLen(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getTag(byte[] bytes) {
        int tag = XFF;
        tag =tag & bytes[INDEX += 4];
        INDEX ++;
        System.out.println(" tag: " + tag + " 此时下标：" + INDEX);
        return tag;
    }

    public int getLen(byte[] bytes){
        int len = XFF;
        System.out.println(bytes[INDEX] & XFF);
        len =bytes[INDEX] & XFF;
        if (len > 127)
            len = len - 128;
        INDEX ++;
        System.out.println(" len: " + len + " 此时下标：" + INDEX);
        return len;
    }

    public int getLenVal(byte[] bytes,int len){
        System.out.println("length:" + len);
        int val = 0;
        int temp = len;
        for (int i = INDEX; i < INDEX + len; i++) {
            val ^= (bytes[i] & XFF) << ((temp-- - 1) * 8);
            System.out.println("val:" + val);
        }
        System.out.println(val);
        System.out.println(" getLenVal: " + val + " 此时下标：" + INDEX);
        INDEX += len;
        return 1;
    }




}
