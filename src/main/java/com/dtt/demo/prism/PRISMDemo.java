package com.dtt.demo.prism;

import org.apache.poi.util.StringUtil;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @Author: duant
 * @Date: 2020/3/6 9:37
 * @Description:
 */
public class PRISMDemo {

    @Test
    public void readTest(){
        List<String> list = new ArrayList<>();
        FileInputStream fis = null;
        InputStreamReader isr = null;
        File file = null;

        try {
            file = new File("D:\\PRISM_1909040941_0291.PRISM.PRISM");
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String str;
            while ((str = br.readLine()) != null){
//                System.out.println(" str: " + str);
                list.add(str);
            }


            char[] chars = list.get(0).toCharArray();
            String strVal = "";
            List<String> valList = new ArrayList<>();
            for(char c:chars){

                if (c == ','){
                    valList.add(strVal);
                    strVal = "";
                }else {
                    strVal = strVal.concat(c + "");
                }
            }
            System.out.println(valList);

//            String strLine = list.get(0);
//            strLine.contains(",");
//            System.out.println(strLine);
//            String[] strings = StringUtils.delimitedListToStringArray(strLine, ",");
////            String[] strings = strLine.split(",");
//            for (String s:strings) {
//                System.out.print(s + " ");
//            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
