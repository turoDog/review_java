package com.nasus.io.filereadwrite;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.filereadwrite <br/>
 * Date:2020/1/5 20:19 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileWrite {

    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象，true 表示在原有数据末尾追加续写
        FileWriter fileWriter = new FileWriter("fw.txt", true);

        // 1、逐个写出字符
        fileWriter.write(97);
        fileWriter.write('C');
        fileWriter.write('Z');
        fileWriter.write('Y');
        // 中文编码表中30000对应一个汉字。
        fileWriter.write(30000);


        // 2、写出字符串
        fileWriter.write("是一个");

        // 3、写出 Windows 换行
        fileWriter.write("\r\n");

        // 4、写出字符串数组
        // 字符串转换为字节数组
        char[] chars = "优秀的废人".toCharArray();
        fileWriter.write(chars, 0, chars.length);

        // 关闭资源，close方法调用之前，数据只是保存到了缓冲区，并未写出到文件中。
        fileWriter.close();
    }

}
