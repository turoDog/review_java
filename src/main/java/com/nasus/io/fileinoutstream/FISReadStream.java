package com.nasus.io.fileinoutstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.filestream <br/>
 * Date:2020/1/5 19:31 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FISReadStream {

    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象.


        // 1、逐个读取字节
        int b;
        FileInputStream fis1 = new FileInputStream("fis.txt");
        // 循环读取
        while ((b = fis1.read())!=-1) {
            System.out.println((char)b);
        }
        // 关闭资源
        fis1.close();

        System.out.println("----华丽丽的分割线----");

        // 2、定义字节数组读取
        int length;
        FileInputStream fis2 = new FileInputStream("fis.txt");
        // 定义字节数组，作为装字节数据的容器
        byte[] bytes = new byte[2];
        // 循环读取
        while ((length = fis2.read(bytes))!=-1) {
            // 每次读取后,把数组变成字符串打印
            System.out.println(new String(bytes, 0, length));
        }
        // 关闭资源
        fis2.close();
    }

}
