package com.nasus.io.file;

import java.io.File;
import java.io.IOException;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.file <br/>
 * Date:2020/1/4 11:49 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileCreateDelete {

    public static void main(String[] args) throws IOException {
        System.out.println("-----创建文件------");
        // 文件的创建
        File file1 = new File("file1.txt");
        System.out.println("是否存在:"+file1.exists()); // false
        System.out.println("是否创建:"+file1.createNewFile()); // true
        System.out.println("是否存在:"+file1.exists()); // true

        System.out.println("-----创建目录------");

        // 目录的创建
        File file2 = new File("fileDir");
        System.out.println("是否存在:"+ file2.exists());// false
        System.out.println("是否创建:"+ file2.mkdir());	// true
        System.out.println("是否存在:"+ file2.exists());// true

        System.out.println("-----创建多级目录------");

        // 创建多级目录
        File file3= new File("fileDir1\\fileDir2");
        System.out.println(file3.mkdir());// false
        File file4 = new File("fileDir1\\fileDir2");
        System.out.println(file4.mkdirs());// true

        System.out.println("-----删除文件------");

        // 文件的删除
        System.out.println(file1.delete());// true

        System.out.println("-----删除目录------");

        // 目录的删除
        System.out.println(file2.delete());// true
        System.out.println(file4.delete());// false
    }

}
