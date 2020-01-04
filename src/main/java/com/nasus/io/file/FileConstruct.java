package com.nasus.io.file;

import java.io.File;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.file <br/>
 * Date:2020/1/3 22:22 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileConstruct {

    public static void  main(String [] args) {
        // 文件路径名
        // 注意 File.separator 代表一个与平台无关的路径常量
        // Windows 中表示 "\\" linux 中表示 "/"
        // 这样写的原因是方便移植
        String pathname = "Z:" + File.separator + "file"+ File.separator +"file.txt";
        File file1 = new File(pathname);
        System.out.println(file1);

        // 通过父路径和子路径字符串
        String parent = "Z:" + File.separator + "file";
        String child1 = "file.txt";
        File file2 = new File(parent, child1);
        System.out.println(file2);

        // 通过父级File对象和子路径字符串
        File parentDir = new File("Z:" + File.separator + "file");
        String child2 = "file.txt";
        File file3 = new File(parentDir, child2);
        System.out.println(file3);
    }

}
