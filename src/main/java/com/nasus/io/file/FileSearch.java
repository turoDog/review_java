package com.nasus.io.file;

import java.io.File;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.io.file <br/>
 * Date:2020/1/4 12:15 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class FileSearch {

    public static void main(String[] args) {
        // 创建File对象
        File dir  = new File("Z:\\IDEAProject");
        // 调用文件搜索方法
        searchFile(dir);
    }

    public static void  searchFile(File dir) {
        // 获取子文件和目录
        File[] files = dir.listFiles();
        // 循环遍历
        for (File file : files) {
            // 判断
            if (file.isFile()) {
                // 输出查找的目标文件的绝对路径
                if ("FileIs.java".equals(file.getName())){
                    System.out.println("目标文件路径:"+ file.getAbsolutePath());
                }
            } else {
                // 是目录,调用自身，形成递归
                searchFile(file);
            }
        }
    }

}
