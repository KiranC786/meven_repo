package TestNg;

import org.testng.annotations.Test;

public class model {
	public class TESTNGprojrct {
		@Test(priority = 1)
	public void a() {
		System.out.println("hai");
	}
		@Test(priority = 4)
	public void b() {
		System.out.println("halo");
	}
		@Test(priority = 2)
	public void c() {
		System.out.println("byee");
	}
		@Test
	public void d() {
		System.out.println("hmmm");
	}
		@Test(priority = 3,invocationCount = 1)
		
	public void e() {
		System.out.println("ok");
	}
	}

}
