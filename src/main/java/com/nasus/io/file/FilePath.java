package com.nasus.io.file;

import java.io.File;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.file <br/>
 * Date:2020/1/4 11:29 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FilePath {

    public static void main(String[] args) {
        // Z盘下的 file.txt 文件
        File file = new File("Z:\\file.txt");
        System.out.println(file.getAbsolutePath());

        // 项目下的 file.txt 文件
        File file2 = new File("file.txt");
        System.out.println(file2.getAbsolutePath());
    }

}
