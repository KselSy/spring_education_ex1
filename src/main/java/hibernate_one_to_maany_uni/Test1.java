package hibernate_one_to_maany_uni;


import hibernate_one_to_maany_uni.entity.Department;
import hibernate_one_to_maany_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try{
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("HR", 25000,65000);
//            Employee emp1 = new Employee("Sergey", "Konstantinov", 35000);
//            Employee emp2 = new Employee("Alina", "Barsukova", 55000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department dep = session.get(Department.class, 2);
//            System.out.println(dep);
//            System.out.println(dep.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp);
//            System.out.println(emp.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*******************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class, 2);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");


        }
        finally {
            session.close();
            factory.close();
        }
    }
}
