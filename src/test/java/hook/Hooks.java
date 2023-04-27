package hook;

import io.cucumber.java.*;


public class Hooks {
@Before(order=1)//order it is used to control the flow of execution and @Before gives prior to lower numbers first as we given as order
public void beforehook()
{
	System.out.println("before hook");
}
@After(order=1)//@After gives prior to higher numbers which we given as order.,it means it will print first highest order
public void afterhook() {
	System.out.println("after hook");
}
@Before(order=2)
public void setuphook()
{
	System.out.println("setup hook");
}
@After(order=3)
public void sethook() {
	System.out.println("set hook");
}
@Before("@smoketest")
public void smokehook()
{
	System.out.println("smoke hook");
}

@After("@smoketest")
public void aftersmokehook() {
	System.out.println("afterhook");
}
}
