package com.nasus.io.file;

import java.io.File;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.file <br/>
 * Date:2020/1/4 11:37 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileIs {

    public static void main(String[] args) {
        File file1 = new File("Z:\\file\\file.txt");
        File file2 = new File("Z:\\file");
        // 判断是否存在
        System.out.println("Z:\\file\\file.txt 是否存在:"+file1.exists());
        System.out.println("Z:\\file 是否存在:"+file2.exists());
        // 判断文件
        System.out.println("Z:\\file\\file.txt 文件?:"+file1.isFile());
        System.out.println("Z:\\file 文件?:"+file2.isFile());
        // 判断目录
        System.out.println("Z:\\file\\file.txt 目录?:"+file1.isDirectory());
        System.out.println("Z:\\file 目录?:"+file2.isDirectory());
    }

}
