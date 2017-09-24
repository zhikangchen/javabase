/**
 * Project Name:lianxi
 * File Name:MyFirstJavaClass.java
 * Package Name:lianxi.lesson
 * Date:2017年9月3日下午3:44:51
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
//定义包路径
package lianxi.lesson;

/**
 * Description:   <br/>
 * Date:     2017年9月3日 下午3:44:51 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
//类名
public class MyFirstJavaClass {

    //属性名
    public String myFirstJavaAttribute;

    public String[] ary;

    //方法名
    public void myFirstJavaMethod() {
        myFirstJavaAttribute = "abc";
        ary = new String[] { "123", "efg" };
        
        System.out.println(myFirstJavaAttribute);
        System.out.println(ary[0]);
        System.out.println(ary[1]);
    }
    
    public static void main(String[] args) {
        MyFirstJavaClass mfjc = new MyFirstJavaClass();
        mfjc.myFirstJavaMethod();
    }
}
