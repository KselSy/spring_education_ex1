package aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
    }
    @After("execution(public void aop.SchoolLibrary.getBook())")
    public void afterGetBookAdvice(){
        System.out.println("afterGetBookAdvice: книга взята");
    }
}
