package TestNg;

import org.testng.annotations.Test;

public class Group2 {
@Test(groups = "smoke")
public void login() {
	System.out.println("login");
}
	@Test(groups = "sanity")
public void home() {
	System.out.println("home");
}
	@Test(groups = "functional")
public void profile() {
	System.out.println("profile");
}
	@Test(groups = "smoke")
public void logout() {
	System.out.println("logout");
}
}
