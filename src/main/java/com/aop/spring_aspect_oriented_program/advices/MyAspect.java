package com.aop.spring_aspect_oriented_program.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.aop.spring_aspect_oriented_program.service.PaymentServiceImp.makepayment(..))")
	public void authoriseUser()
	{
		System.out.println("Authorization implemented..");
	}
	
	@After("execution(* com.aop.spring_aspect_oriented_program.service.PaymentServiceImp.makepayment(..))")
	public void taskCompleted()
	{
		System.out.println("Transaction Completed..");
	}
	
	
}
