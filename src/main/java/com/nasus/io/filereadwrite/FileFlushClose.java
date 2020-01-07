package com.nasus.io.filereadwrite;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.filereadwrite <br/>
 * Date:2020/1/5 22:25 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileFlushClose {

    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileWriter fw = new FileWriter("fw.txt");
        // 1、通过 flush 写出数据
        // 写出第 1 个字符
        fw.write('刷');
        fw.flush();

        // 继续写出第 2 个字符，写出成功
        fw.write('新');
        fw.flush();

        // 2、通过 close 写出数据，流关闭后不可用
        // 写出第 1 个字符
        fw.write('关');
        fw.close();

        // 继续写出第 2 个字符,【报错】java.io.IOException: Stream closed
        fw.write('闭');
        fw.close();
    }

}
