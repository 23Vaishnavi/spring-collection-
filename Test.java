package collection2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("collection2/col.xml");
	Collections c2=(Collections)c1.getBean("collect");
	System.out.println(c2);
	System.out.println(c2.getStudentid().getClass());
	System.out.println(c2.getStudentname().getClass());
	System.out.println(c2.getStudentidname().getClass());

	}

}
