package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
 
      JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
      jc.getAddressList();
      jc.getAddressMap();
      jc.getAddressProp();
      jc.getAddressSet();
      
      HelloIndia hi = (HelloIndia) context.getBean("helloIndia");
/*      hi.getMessage1();
      hi.getMessage2();
      hi.getMessage3();*/
      
      //Car car = context.getBean(Car.class);
      
      /*      sau	*/
      
      Car car = (Car) context.getBean("toyota");
      
/*      System.out.println("Cilindri: " + car.getEngine().getCilinders());
      System.out.println("Motor: " + car.getEngine().getVersion());
      System.out.println("Cutie: " + car.getTransmission().getType());*/
   }
}
