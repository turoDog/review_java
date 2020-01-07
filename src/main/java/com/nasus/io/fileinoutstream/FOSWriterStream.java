package com.nasus.io.fileinoutstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.filestream <br/>
 * Date:2020/1/5 19:24 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FOSWriterStream {

    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象，构造函数中的 true 表示在原有数据末尾追加续写
        FileOutputStream fos = new FileOutputStream("fos.txt", true);

        // 1、逐个字节写出
        fos.write(97); // 97 的 ascll 码是 a
        fos.write(98); // 98 的 ascll 码是 b
        fos.write(99); // 99 的 ascll 码是 c

        // 2、写出一个换行, 换行符号转成数组写出
        fos.write("\r\n".getBytes());

        // 字符串转换为字节数组
        byte[] b = "一个优秀的废人".getBytes();
        // 3、写出字节数组数据
        fos.write(b);

        // 4、写出指定长度字节数组数据（不可超过 b 的长度，否则数组越界）
        fos.write(b, 0, b.length);

        // 关闭资源
        fos.close();
    }

}
