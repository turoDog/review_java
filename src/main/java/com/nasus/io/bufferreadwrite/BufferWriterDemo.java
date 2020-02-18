package com.nasus.io.bufferreadwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.bufferinoutstream <br/>
 * Date:2020/2/17 23:24 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class BufferWriterDemo {

    public static void main(String[] args) throws IOException {
        // 创建流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
        // 写出数据
        bw.write("一个");
        // 写出换行
        bw.newLine();
        bw.write("优秀");
        bw.newLine();
        bw.write("废人");
        bw.newLine();
        // 释放资源
        bw.close();
    }

}
