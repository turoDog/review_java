package com.nasus.io.bufferreadwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.bufferinoutstream <br/>
 * Date:2020/2/17 23:37 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class BufferSortTest {

    public static void main(String[] args) throws IOException {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<>();

        // 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("乱序.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("正序.txt"));

        // 读取数据
        String line  = null;
        while ((line = br.readLine())!=null) {
            // 解析文本
            String[] split = line.split("\\.");
            // 保存到集合
            lineMap.put(split[0],split[1]);
        }
        // 关闭资源
        br.close();

        // 遍历map集合
        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
            // 获取map中文本
            String value = lineMap.get(key);
            // 写出拼接文本
            bw.write(key+"."+value);
            // 写出换行
            bw.newLine();
        }
        // 关闭资源
        bw.close();
    }

}
