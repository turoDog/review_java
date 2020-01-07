package com.nasus.io.filereadwrite;

import java.io.FileReader;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.filereadwrite <br/>
 * Date:2020/1/5 20:19 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileRead {

    public static void main(String[] args) throws IOException {

        // 1、逐个字符读取
        int b = 0;
        FileReader fileReader1 = new FileReader("read.txt");
        // 循环读取
        while ((b = fileReader1.read())!=-1) {
            // 自动提升类型提升为 int 类型，所以用 char 强转
            System.out.println((char)b);
        }
        // 关闭流
        fileReader1.close();

        System.out.println("----华丽丽的分割线----");

        // 2、利用字符数组，每次读取两个字符
        int length = 0;
        FileReader fileReader2 = new FileReader("read.txt");
        char[] charArray = new char[2];
        // 读取数据
        while ((length = fileReader2.read(charArray)) != -1) {
            System.out.println(new String(charArray, 0, length));
        }
        // 关闭流
        fileReader2.close();
    }

}
