package cn.edu.bupt.cycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("before getBean");
        Student student = (Student) context.getBean("student");
        //Bean的使用
        student.play();
        System.out.println(student);
        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}
