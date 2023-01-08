package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        Person myPerson = context.getBean("personBean", Person.class);
        myPerson.callYourPet();
        System.out.println(myPerson.getAge());
        System.out.println(myPerson.getLastName());


        context.close();
    }
}
