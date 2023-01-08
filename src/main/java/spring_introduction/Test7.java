package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        myDog.say();

//        Dog yourDog = context.getBean("dogBean", Dog.class);
//        System.out.println("Переменные ссылаются на один и тот же объект? " +
//                (myDog==yourDog));

        context.close();
    }
}
