package TestNg;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = { "functional", "sanity" })
	public void facebook() {
		System.out.println("facebook Application");
	}

	@Test(groups = "smoke")
	public void trello() {
		System.out.println("trello Appliction");

	}
}
