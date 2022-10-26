
import java.io.IOException;
import entity.Message;
import entity.Secretary;
import logic.UrlsChanges;
import logic.UrlsParser;

public class Main {

  public static void main(String[] args) throws IOException {

    Secretary secretary = new Secretary("Ирина", "Никулина");

    Message message = new Message(secretary);

    UrlsParser urlsParser = new UrlsParser();

    UrlsChanges changes = new UrlsChanges();

    urlsParser.getUrls("src/main/resources/todayUrls.txt", "src/main/resources/yesterdayUrls.txt");

    changes.findChanges(urlsParser.getYesterdayUrls(), urlsParser.getTodayUrls());

    System.out.println(message.writeMessage(changes.getAdded(), changes.getDeleted(), changes.getChanged()));

  }

}
