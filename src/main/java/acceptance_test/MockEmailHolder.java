package acceptance_test;
import static org.mockito.Mockito.*;


public class MockEmailHolder {
	private WebEmailService emailservice =mock(WebEmailService.class);

	public MockEmailHolder(FinderApp findapp) {
		findapp.setEmailservice(emailservice);
 	}

	public WebEmailService getEmailservise() {
		return emailservice;
	}

	public void setEmailservise(WebEmailService emailservise) {
		this.emailservice = emailservise;
	}
	
	
}
