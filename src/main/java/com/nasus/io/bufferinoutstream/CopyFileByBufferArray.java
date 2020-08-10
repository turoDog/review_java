package com.nasus.io.bufferinoutstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.bufferinoutstream <br/>
 * Date:2020/2/17 23:03 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class CopyFileByBufferArray {

    public static void main(String[] args) throws FileNotFoundException {
        // 开始时间
        long startTime = System.currentTimeMillis();
        // 计数器，用于判断
        int b;
        // 使用数组，一次读多点
        byte[] bytes = new byte[8*1024];
        try {
            // 创建缓冲流，复制电影
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Z:\\唐顿庄园BD中英双字.mp4"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Z:\\movie\\复制唐顿庄园BD中英双字.mp4"));
            // 读写数据
            while ((b = bis.read(bytes)) != -1) {
                bos.write(bytes, 0 , b);
            }
            // 关闭资源
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 结束时间
        long endTime = System.currentTimeMillis();
        // 统计用时
        System.out.println("缓冲流（使用数组）复制时间:" + (endTime - startTime) + " 毫秒");
    }

}
