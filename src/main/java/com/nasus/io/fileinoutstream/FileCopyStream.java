package com.nasus.io.fileinoutstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.filestream <br/>
 * Date:2020/1/5 19:43 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileCopyStream {

    public static void main(String[] args) throws IOException {

        // 指定数据源
        FileInputStream fis = new FileInputStream("Java IO 流.png");
        // 指定目的地
        FileOutputStream fos = new FileOutputStream("流.png");

        // 定义数组
        byte[] b = new byte[1024];
        // 定义长度
        int len;
        // 循环读取
        while ((len = fis.read(b))!=-1) {
            // 写出数据
            fos.write(b, 0 , len);
        }

        // 关闭资源，后开先关，后开先关
        fos.close();
        fis.close();
    }

}
