package com.springcore.ci;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        
//        Person person = (Person) context.getBean("person1");
//        Person person2 = (Person) context.getBean("person2");
//        Person person3 = (Person) context.getBean("person3");
//        Person withcerti=(Person)context.getBean("withcerti2");
        
//        System.out.println(person);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(withcerti);
//        System.out.println(withcerti.getCerti());
        
        Addition addition = (Addition) context.getBean("addition1");
        
        System.out.println(addition);
        addition.doSum();
    }
}
