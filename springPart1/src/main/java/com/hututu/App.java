package com.hututu;

import com.hututu.pojo.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * 功能描述：1.直接new一个Car
         */
        Car c1 = new Car();
        c1.setName("byd");
        System.out.println("直接new一个Car的Name："+c1.getName());

        /**
         * 功能描述：2.由spring管理控制“new”一个car
         */
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

        Car c2 = (Car) context.getBean("springCar");

        System.out.println("spring管理的Car的Name："+c2.getName());
    }
}
