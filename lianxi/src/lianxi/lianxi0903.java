/**
 * Project Name:lianxi
 * File Name:lianxi.java
 * Package Name:lianxi
 * Date:2017年9月3日下午1:28:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 * 
 * 1.内置对象；
 * 2.实例化 new 关键字；
 * 3.引入对象 import 关键字；
 * 4.包名（类路径）  package 关键字；
 * 
 */
/**
 * 包名：给类文件分类，方便查找<br>
 * 语法：package关键字 + 空格 + 包名;<br>
 * 多级包名，用半角的句号分隔;<br>
 * 编写位置：申明包名时，必须在代码的首行
 */
package lianxi;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * import 引入需要的类<br>
 * 语法：import关键字 + 空格 + 类路径+类名； <br>
 * import java/util/Scanner<br>
 * 编写位置：在package和类申明代码之间
 */
/**
 * Description:   <br/>
 * Date:     2017年9月3日 下午1:28:16 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class lianxi0903 {

    /**
     * 
     * JS的运行环境：浏览器的JS引擎；
     * java的运行环境：JDK；
     * 
     * 内置对象，在运行环境中，可以直接使用的对象；（运行环境直接给我们定义好了的对象[变量]，不需要我们定义的，）
     * JS的内置对象有：window、document;
     * java的内置对象有：System
     */

    public static void main(String[] args) {
        //内置对象System提供的>>>系统的输入口
        InputStream in = System.in;
        //内置对象System提供的>>>系统的输出口
        PrintStream out = System.out;

        //不是我们自定义的类对象，也不是系统提供的内置对象
        //是JDK自带的类对象
        Scanner scanner = new Scanner(in);
        //new 关键字 >>> 把代码，变成实例，整个过程，就是实例化

        out.println("请输入你的名称");
        String line = scanner.nextLine();
        out.println("你的名称是：" + line);
        scanner.close();
    }

}
