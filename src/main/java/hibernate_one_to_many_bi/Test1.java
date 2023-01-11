package hibernate_one_to_many_bi;



import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
//            Department dep = new Department("HR", 25000,45000);
//            Employee emp1 = new Employee("Ivan", "Bodrov", 25000);
//            Employee emp2 = new Employee("Elena", "Volkova", 35000);
//            Employee emp3 = new Employee("Maksim", "Bogdanov", 45000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
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
//            System.out.println("Get department");
//            Department dep = session.get(Department.class, 4);
//            System.out.println("Show department");
//            System.out.println(dep);
//            System.out.println("Подгрузим работников");
//            dep.getEmps().get(0);
//
//            session.getTransaction().commit();
//            System.out.println("Show employees of the department");
//            System.out.println(dep.getEmps());
//
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
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 4);
//            session.delete(emp);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


        }
        finally {
            session.close();
            factory.close();
        }
    }
}
