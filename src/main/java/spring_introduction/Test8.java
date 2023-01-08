package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        context.close();
    }
 }
