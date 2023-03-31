package training.oracle.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method businessMethodName, Object[] businessMethodArgs, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging After Advice Fired ... ");
		System.out.println("On Business Method " + businessMethodName.getName());
		System.out.println("Parameters Passed to Business method " + businessMethodArgs[0]);
		System.out.println("Return Value from the Business Method " + returnValue);
	}

}
