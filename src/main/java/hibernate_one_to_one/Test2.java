package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try{
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Kostya", "Korchev",
//                    "HR", 55000);
//            Detail detail = new Detail("SPB", "999424818",
//                    "kostyan@mail.ru");
//
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class,4);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class,1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
