package chapter07.number03;

public class HttpServeltExample {

	public static void main(String[] args) {

		method(new LoginServlet());
		method(new FileDownloadServlet());

	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	
		
		
	}

}
