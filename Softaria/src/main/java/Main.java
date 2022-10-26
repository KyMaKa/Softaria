package main.java;

import java.io.IOException;
import main.java.entity.Message;
import main.java.entity.Secretary;
import main.java.logic.UrlsChanges;
import main.java.logic.UrlsParser;

public class Main {

  public static void main(String[] args) throws IOException {

    Secretary secretary = new Secretary("Ирина", "Никулина");

    Message message = new Message(secretary);

    UrlsParser urlsParser = new UrlsParser();

    UrlsChanges changes = new UrlsChanges();

    urlsParser.getUrls();

    changes.findChanges(urlsParser.getYesterdayUrls(), urlsParser.getTodayUrls());

    System.out.println(message.writeMessage(changes.getAdded(), changes.getDeleted(), changes.getChanged()));

  }
}
