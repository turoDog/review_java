package com.nasus.io.file;

import java.io.File;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.file <br/>
 * Date:2020/1/4 12:02 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileList {

    public static void main(String[] args) {
        File dir = new File("Z:\\IDEAProject");

        //获取当前目录下的文件以及文件夹的名称，用处不大。
        String[] names = dir.list();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println("--------------------------------");
        //获取当前目录下的文件以及文件夹对象，拿到了文件对象，可以做更多操作，项目常用
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

}
