package com.nasus.io.bufferinoutstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.bufferinoutstream <br/>
 * Date:2020/2/17 22:41 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class CopyFileByByteStream {

    public static void main(String[] args) throws FileNotFoundException {
        // 开始时间
        long startTime = System.currentTimeMillis();
        // 计数器，用于判断
        int b;
        try {
            // 创建字节流、复制电影
            FileInputStream fis = new FileInputStream("Z:\\唐顿庄园BD中英双字.mp4");
            FileOutputStream fos = new FileOutputStream("Z:\\movie\\复制唐顿庄园BD中英双字.mp4");
            // 读写数据
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            // 关闭资源
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 结束时间
        long endTime = System.currentTimeMillis();
        // 统计用时
        System.out.println("普通流复制时间:" + (endTime - startTime) + " 毫秒");
    }

}
