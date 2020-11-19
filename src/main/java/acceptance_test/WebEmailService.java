package acceptance_test;

import java.util.List;
import com.sun.mail.smtp.SMTPTransport;
import static org.mockito.Mockito.*;
 import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;
 
public class WebEmailService {

	public  static void sendEmail(String email, List<Home> homein) {
		 final String SMTP_SERVER = "smtp server ";
		    final String USERNAME = " ";
		    final String PASSWORD = " ";

		    final String EMAIL_FROM = "tharaaabuhamed49@gmail.com";
		    final String EMAIL_TO = "tharaaabuhamed49@gmail.com";
		    final String EMAIL_TO_CC = "";

		    final String EMAIL_SUBJECT = "Test Send Email via SMTP";
		    final String EMAIL_TEXT = "Hello Java Mail \n ABC123";
 	        Properties prop = System.getProperties();
		        prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
		        prop.put("mail.smtp.auth", "true");
		        prop.put("mail.smtp.port", "25"); // default port 25

		        Session session = Session.getInstance(prop, null);
		        Message msg = new MimeMessage(session);

		        try {
		        
		            // from
		            msg.setFrom(new InternetAddress(EMAIL_FROM));

		            // to 
		            msg.setRecipients(Message.RecipientType.TO,
		                    InternetAddress.parse(EMAIL_TO, false));

		            // cc
		            msg.setRecipients(Message.RecipientType.CC,
		                    InternetAddress.parse(EMAIL_TO_CC, false));

		            // subject
		            msg.setSubject(EMAIL_SUBJECT);
		            
		            // content 
		            msg.setText(EMAIL_TEXT);
		            
		            msg.setSentDate(new Date());

		            // Get SMTPTransport
		            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
		            
		            // connect
		            t.connect(SMTP_SERVER, USERNAME, PASSWORD);
		            
		            // send
		            t.sendMessage(msg, msg.getAllRecipients());

		            System.out.println("Response: " + t.getLastServerResponse());

		            t.close();

		        } catch (MessagingException e) {
		            e.printStackTrace();
		        }


		    }
		
	}

	

	
 
