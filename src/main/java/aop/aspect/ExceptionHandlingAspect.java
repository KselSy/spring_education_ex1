package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: ловим, обрабатываем " +
                "исключения при попытке получить книгу или журнал");
        System.out.println("----------------------------------");
    }
}
