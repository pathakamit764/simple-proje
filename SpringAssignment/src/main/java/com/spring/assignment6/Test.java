package com.spring.assignment6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(DataConfig.class);

DBConfig db=con.getBean("dbconfig",DBConfig.class);
db.printDB();
	}

}
