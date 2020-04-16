package text;

import entity.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args) {

        /*IOC(Inversion of controller)控制反转
         *本来创建对象的权利是交给我们java代码的，现在交给spring，我们只需要向spring中
         * 配置一下对象，下次只需要获取就行，无需new出来 */
        //获取spring容器中对象一般有两种方法：applicationText,BeanFactory
        //通过ApplicationContext对象获取applicationContext.xml配置，获取对象信息

        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext.xml");


        Student stu2= (Student) ac.getBean("student");
        System.out.println(stu2.toString());

        Student stu3= (Student) ac.getBean("student");
        System.out.println(stu2==stu3);

        Teacher tea1= (Teacher) ac.getBean("tea1");
        System.out.println(tea1);

        Teacher tea2= (Teacher) ac.getBean("tea2");
        System.out.println(tea2);

        More m1= (More) ac.getBean("msg");
        System.out.println(m1);

        Animal animal= (Animal) ac.getBean("abc");
        System.out.println(animal);
        Animal animal2= (Animal) ac.getBean("abc");
        System.out.println(animal==animal2);

        Dog dog=(Dog) ac.getBean("dog");
        System.out.println(dog);

        ((AbstractApplicationContext) ac).registerShutdownHook(); //关闭容器会调用destroy方法


    }
}
