import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Sms;
import com.twilio.sdk.resource.list.SmsList;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.*;

public class sendBirthday {
	  
	// Find your Account Sid and Token at twilio.com/user/account
	  public static final String ACCOUNT_SID = "ACf07f52c994620f69626b77e2a9e48d69";
	  public static final String AUTH_TOKEN = "";
	 
	  public static void main(String[] args) throws TwilioRestException {
	    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
	    // Build a filter for the SmsList
	    DateTime tempDate = new DateTime();
	    tempDate.now();
	    DateTime dateToday = new DateTime(tempDate.getYear(),tempDate.getMonthOfYear(),tempDate.getDayOfMonth(),0,0,0,0);
	    System.out.println(dateToday.toString());
	    
	   /* Map<String, String> params = new HashMap<String, String>();
	    params.put("Body", "I love you <3");
	    params.put("To", "+12016185883");
	    params.put("From", "+1949-667-9916");
	    
	    SmsFactory messageFactory = client.getAccount().getSmsFactory();
	    Sms message = messageFactory.create(params);
	    System.out.println(message.getSid());
	    */
	  }
	  
	  public DateTime getBirthday(String birthday){
		  return null;
	  }
	  
}