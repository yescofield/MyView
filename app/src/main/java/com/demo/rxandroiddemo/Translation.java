package com.demo.rxandroiddemo;

/**
 * Created by tuion on 2017/8/26
 * URL模板http://fy.iciba.com/ajax.php
 * URL实例http://fy.iciba.com/ajax.php?a=fy&f=auto&t=auto&w=hello%20world
 *
 * 参数说明：
 * a：固定值 fy
 * f：原文内容类型，日语取 ja，中文取 zh，英语取 en，韩语取 ko，德语取 de，西班牙语取 es，法语取 fr，自动则取 auto
 * t：译文内容类型，日语取 ja，中文取 zh，英语取 en，韩语取 ko，德语取 de，西班牙语取 es，法语取 fr，自动则取 auto
 * w：查询内容
 */
public class Translation {

    private String status;
    private content content;
    private static class content{
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }

    public void show() {
        System.out.println(status);
        System.out.println(content.from);
        System.out.println(content.to);
        System.out.println(content.vendor);
        System.out.println(content.out);
        System.out.println(content.errNo);
    }

}
