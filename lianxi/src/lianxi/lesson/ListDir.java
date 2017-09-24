/**
 * Project Name:lianxi
 * File Name:ListDir.java
 * Package Name:lianxi.lesson
 * Date:2017年9月3日下午5:16:45
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lianxi.lesson;

import java.io.File;

/**
 * Description:   <br/>
 * Date:     2017年9月3日 下午5:16:45 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class ListDir {

    /**
     * 主函数|入口函数<br>
     * 
     * 类中，有主函数，才可以运行
     * 
     * Description: <br/>
     *
     * @author junwen.bao@airintelli.com
     * @param args
     */
    public static void main(String[] args) {

        //File dir = new File("D:\\workspace\\dt36\\lianxi\\src\\lianxi\\lesson");
        File dir = new File("D:\\workspace\\dt36");
        ListDir listDir = new ListDir();
        
        listDir.listDir2(dir);
    }

    /**
     * 函数的语法格式
     * 
     * 修改符 + 函数名 + （+参数+）{
     *    函数代码块
     * }
     * 
     * Description: <br/>
     *
     * @author junwen.bao@airintelli.com
     * @param dir
     */

    public void listDir(File dir) {
        //获取目录下的文件或者目录的名称
        String[] files = dir.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }

    public void listDir2(File dir) {
        //获取目录下的文件或者目录的对象
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            //是否是目录
            boolean isDir = file.isDirectory();
            if (isDir) {
                //获取 目录完整路径
                System.out.println("目录名：" + file.getAbsolutePath());
                
                this.listDir2(file);
            } else {
                //获取文件完整路径
                System.out.println("文件名：" + file.getAbsolutePath());
            }
        }
    }
}
