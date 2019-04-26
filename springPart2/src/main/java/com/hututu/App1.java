package com.hututu;

import com.hututu.service.ProductService;
import com.hututu.service.ProductService1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext1.xml" });
        ProductService1 s = (ProductService1) context.getBean("s");
        s.doSomeService();
    }
}
