package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    Greeter greeter = new Greeter();
    LocalTime localtime = new LocalTime();
    System.out.println("Current time is: HH:" +localtime.getHourOfDay() +" MI:"+localtime.getMinuteOfHour()+" SS:"+localtime.getSecondOfMinute());
    System.out.println(greeter.sayHello());

  }
}

