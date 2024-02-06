package com.springcore.ref;

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
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        
        A a=(A) context.getBean("aref");
        A a2=(A) context.getBean("aref2");
        A a3=(A) context.getBean("aref3");
        
        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);
    }
}
