import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Sms;
import com.twilio.sdk.resource.list.SmsList;
import java.util.HashMap;
import java.util.Map;
 
public class Example {
 
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACf07f52c994620f69626b77e2a9e48d69";
  public static final String AUTH_TOKEN = "";
 
  public static void main(String[] args) throws TwilioRestException {
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
    // Build a filter for the SmsList
    Map<String, String> params = new HashMap<String, String>();
    params.put("Body", "Hi from hackRU :)");
    params.put("To", "+17325702145");
    params.put("From", "+1949-667-9916");
 
    SmsFactory messageFactory = client.getAccount().getSmsFactory();
    Sms message = messageFactory.create(params);
    System.out.println(message.getSid());
  }
}