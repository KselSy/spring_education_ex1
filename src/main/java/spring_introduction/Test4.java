package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDogPrototype = context.getBean("myPetPrototype", Dog.class);
        myDogPrototype.setName("Belka");
        Dog yourDogPrototype = context.getBean("myPetPrototype", Dog.class);
        yourDogPrototype.setName("Strelka");

        System.out.println("myDogePrototype name is " + myDogPrototype.getName());
        System.out.println("yourDogePrototype name is " + yourDogPrototype.getName());


        Dog myDogSingleton = context.getBean("myPetSingleton", Dog.class);
        myDogPrototype.setName("Belka");
        Dog yourDogSingleton = context.getBean("myPetSingleton", Dog.class);
        yourDogSingleton.setName("Strelka");

        System.out.println("myDogeSingleton name is " + myDogSingleton.getName());
        System.out.println("yourDogeSingleton name is " + yourDogSingleton.getName());

//        System.out.println("Переменные ссылаются на один и тот же объект?" +
//                (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);


        context.close();
    }
}
