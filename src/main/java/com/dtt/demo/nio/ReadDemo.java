package com.dtt.demo.nio;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author: duant
 * @Date: 2020/3/5 15:37
 * @Description:
 */
public class ReadDemo {

    public static void main(String[] args) {
        String path="D:\\1";
        int seekPointer=20;
        randomRed(path,seekPointer);//读取的方法

    }

    public static void randomRed(String path,int pointe){
        RandomAccessFile raf = null;
        try{
            raf=new RandomAccessFile(path, "r");
            //获取RandomAccessFile对象文件指针的位置，初始位置是0
            raf.seek(pointe);//移动文件指针位置
            byte[]  buff=new byte[10240];
            //用于保存实际读取的字节数
            int hasRead=0;
            //循环读取
            while((hasRead=raf.read(buff))>0){
                //打印读取的内容,并将字节转为字符串输入

                System.out.println(new String(buff,0,hasRead));
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static String bytesToHexString(byte[] src) {

        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
}
