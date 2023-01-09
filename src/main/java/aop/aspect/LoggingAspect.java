package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsFromUniLibraryWithoutReturnMagazine(){}
//
//    @Before("allMethodsFromUniLibraryWithoutReturnMagazine()")
//    public void beforeAllMethodsFromUniLibraryWithoutReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsFromUniLibraryWithoutReturnMagazineAdvice: " +
//                "writing Log");
//    }




//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetsMethodFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("!allGetsMethodFromUniLibrary() && !allReturnMethodsFromUniLibrary()")
//    private void allAddMethodsFromUniLibrary(){}
//
//    @Before("allGetsMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allAddMethodsFromUniLibrary()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: writing Log#3");
//    }




    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() + ", год издания - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }


        System.out.println("beforeGetLoggingAdvice: попытка получить книгу или журнал");
        System.out.println("----------------------------------");
    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }
//    @After("execution(public void aop.SchoolLibrary.getBook())")
//    public void afterGetBookAdvice(){
//        System.out.println("afterGetBookAdvice: книга взята");
//    }
}
