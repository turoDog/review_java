package com.nasus.io.bufferreadwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.bufferinoutstream <br/>
 * Date:2020/2/17 23:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class BufferReaderDemo {

    public static void main(String[] args) throws IOException {
        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("br.txt"));
        // 定义字符串,保存读取的一行文字
        String line = null;
        // 循环读取,读取到最后返回null
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            System.out.println("------");
        }
        // 释放资源
        br.close();
    }

}
