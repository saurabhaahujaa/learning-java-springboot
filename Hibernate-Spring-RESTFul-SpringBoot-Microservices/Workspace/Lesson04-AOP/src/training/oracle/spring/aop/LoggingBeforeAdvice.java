package training.oracle.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method businessMethodName, Object[] businessMethodArgs, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Logging Before Advice Fired ... ");
		System.out.println("On Business Method " + businessMethodName.getName());
		System.out.println("Parameters Passed to Business method " + businessMethodArgs[0]);
	}

}
