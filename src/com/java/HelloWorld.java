package com.java;
import com.bean.Customer;

import java.util.ArrayList;

public class HelloWorld {
    /*
    * Ctrl + /	智能补全
Alt + Enter	相当于eclipse里Alt + /智能补全外的其他选项，或许还要更强大
Alt + Insert	生成代码的constructor override toString等等
Ctrl + shift + 空格	对于喜欢写漂亮的文档注释的，可以通过Ctrl + shift + 空格 来预览Documentation
Ctrl + Alt + shift + T	超级重构，包含重构的常用功能
Alt + shift + R	重构之重命名
Alt + shift + C	重构之修改方法签名
Alt + shift + M	重构之修抽取方法
Ctrl + shift + X	大小写切换
Ctrl + F	当前文档查找
Ctrl + H	超级查找
Ctrl + T	查看实现类
Ctrl + o	查看当前类的成员属性
Ctrl + shift + E	最近修改过的文件
Ctrl + D	比较文件内容
Ctrl + F9	编译所有文件
Ctrl + shift +  F9	编译有改动的文件
\
    * */
  private static final  Customer c = new Customer();
    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        String[] arr = new String[]{"dfa","ff"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        //list.for
        ArrayList<Object> list = new ArrayList<>();
        list.add("fdas");
        list.add("123");
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        // list.nn
        if (list != null) {

        }


    }
}
