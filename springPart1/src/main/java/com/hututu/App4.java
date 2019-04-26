package com.hututu;

import com.hututu.compentPojo.Vechile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main( String[] args )
    {
        /**
         * 功能描述：spring注入一个类
         */
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext4.xml" });

        Vechile v = (Vechile) context.getBean("springVehicle");

        System.out.println("spring管理的vehicle的Name："+v.getName());
        System.out.println("--vehicle的Car的Name："+v.getCar().getName());
    }
}
