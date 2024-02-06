package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
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
        
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
        
        context.registerShutdownHook();
        
//        Samosa samosa=(Samosa) context.getBean("s1");
//        
//        System.out.println(samosa);
        Example example = context.getBean("e1",Example.class);
        
        System.out.println(example);
        
    }
}
