package com.nasus.io.file;

import java.io.File;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.file <br/>
 * Date:2020/1/4 11:01 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileGet {

    public static void main(String[] args) {

        File file1 = new File("Z:"+ File.separator + "file" + File.separator + "file.txt");
        System.out.println("文件绝对路径:"+file1.getAbsolutePath());
        System.out.println("文件构造路径:"+file1.getPath());
        System.out.println("文件名称:"+file1.getName());
        System.out.println("文件长度:"+file1.length()+"字节");

        System.out.println("----------------------");

        // 表示根目录,  在 windows 下：File.separator + "file" = "\\file"
        File file2 = new File(File.separator + "file");
        // 绝对路径
        System.out.println("目录绝对路径:"+file2.getAbsolutePath());
        // 构造 File 实例时的路径
        System.out.println("目录构造路径:"+file2.getPath());
        System.out.println("目录名称:"+file2.getName());
        System.out.println("目录长度:"+file2.length());
    }

}
