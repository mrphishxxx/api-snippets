// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.sdk.TwilioMonitorClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.instance.monitor.Event;
import com.twilio.sdk.resource.list.monitor.EventList;

public class Example {

  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "{{ auth_token }}";

  public static void main(String[] args) throws TwilioRestException {
    TwilioMonitorClient client = new TwilioMonitorClient(ACCOUNT_SID, AUTH_TOKEN);

    Map<String, String> params = new HashMap<String, String>();
    params.put("SourceIpAddress", "104.14.155.29");
    params.put("StartDate", "2015-04-25T00:00:00Z");
    params.put("EndDate", "2015-04-25T23:59:59Z");
    EventList events = client.getEvents(params);

    for (Event e : events) {
      System.out.println(e.getDescription());
    }
  }
}
